package com.example.gdg3.detail;

import com.example.gdg3.detail.DTO.*;
import com.example.gdg3.entity.Menu;
import com.example.gdg3.entity.Review;
import com.example.gdg3.entity.Store;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

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
        List<Menu> menus = menuRepository.findByStoreId(storeId);
        List<MenuObject> menuList = new ArrayList<>();
        menus.forEach(one -> {
            menuList.add(new MenuObject(one.getMenuName(),one.getPrice()));
        });
        storeDetailDto.setMenuInfo(new MenuInfo(menuList));

        //review count 구하기
        long reviewNum = reviewRepository.countByStoreId(storeId);
        storeDetailDto.setReviewCount(reviewNum);

        //review 정보 가져오기
        List<Review> reviews = reviewRepository.findByStoreId(storeId);
        List<ReviewObject> reviewList = new ArrayList<>();
        reviews.forEach(one -> {
            reviewList.add(new ReviewObject(one.getNickname(),one.getReviewTags(),one.getContent(),one.getCreatedAt()));
        });
        storeDetailDto.setReviewInfo(new ReviewInfo(reviewList));

        return storeDetailDto;

    }


}
