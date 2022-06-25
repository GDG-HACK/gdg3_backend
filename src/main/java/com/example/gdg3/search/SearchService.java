package com.example.gdg3.search;

import com.example.gdg3.detail.StoreRepository;
import com.example.gdg3.entity.Image;
import com.example.gdg3.entity.Store;
import com.example.gdg3.search.DTO.StoreItem;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class SearchService {

    private final StoreRepository storeRepository;

    private final ImageRepository imageRepository;

    public List<StoreItem> search(String location, String latitude, String longitude, int pageNum, int size) {
        List<Store> stores;
        if(location != null) {
            stores = storeRepository.findByAddressContaining(location);
        }
        else {
            float lat = Float.parseFloat(latitude);
            float lon = Float.parseFloat(longitude);

            stores = storeRepository.findByLatitudeAndLongitude(lat, lon);
        }
        stores = stores.stream()
                .skip((pageNum - 1) * size)
                .limit(size)
                .collect(Collectors.toList());

        List<StoreItem> result = new ArrayList<>();
        for(Store store : stores) {
            String imgUrl = imageRepository.findImageByStoreId(store.getId()).getImgUrl();

            result.add(new StoreItem(store, imgUrl));
        }
        return result;
    }




}
