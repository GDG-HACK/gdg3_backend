package com.example.gdg3.detail;

import com.example.gdg3.detail.DTO.StoreDetailDto;
import com.example.gdg3.detail.DTO.StoreInfo;
import com.example.gdg3.entity.Store;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class DetailService {

    private final MenuRepository menuRepository;

    private final ReviewRepository reviewRepository;

    private final StoreRepository storeRepository;

    public StoreDetailDto getShopDetail(long storeId) {
        StoreDetailDto storeDetailDto = new StoreDetailDto();

        //가게 정보 가져오기
        Store store = storeRepository.findStoreById(storeId);
        storeDetailDto.setStoreInfo(new StoreInfo(store));

        //menu 정보 가져오기

        //review count 구하기

        //review 정보 가져오기

        return storeDetailDto;

    }


}
