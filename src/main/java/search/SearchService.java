package search;


import entity.Store;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;


public class SearchService {

    List<Store> nearStores;

    HashMap<String, List<Store>> nea;

    public SearchService() {
        List<String> tag1 = new ArrayList<>();
        tag1.add("휠체어 사용자");
        tag1.add("입구 경사로");
        tag1.add("엘리베이터 있음");

        List<String> tag2 = new ArrayList<>();
        tag2.add("어린이");
        tag2.add("어린이메뉴");

        List<String> tag3 = new ArrayList<>();
        tag3.add("반려동물");
        tag3.add("반려동물 동반가능");

        Store store = new Store(1L, "카페세렌디","126.411422", "33.2496495", "베이글이 맛있는 예스키즈존, 예스펫존",
                "제주특별자치도 서귀포시 중문관광로72번길 29-9 내 라동 (색달동, 신우성타운)", "064-738-7832", "09:00",
                "19:00", null, null, tag1, tag2, tag3,  "카페" );

        nearStores.add(store);

        tag1 = new ArrayList<>();
        tag1.add("휠체어 사용자");
        tag1.add("엘리베이터 있음");

        tag2 = new ArrayList<>();
        tag2.add("어린이");
        tag2.add("어린이메뉴");

        tag3 = new ArrayList<>();
        tag3.add("반려동물");
        tag3.add("반려동물 동반가능");

        store = new Store(2L, "더클리프","126.417796", "33.2448109", "복합 어뮤즈먼트 파티",
                "제주 서귀포시 중문관광로 154-17", "0507-1312-8866", "10:00",
                "01:00", null, null, tag1, tag2, tag3,  "카페" );

        nearStores.add(store);

        tag1 = new ArrayList<>();
        tag1.add("휠체어 사용자");

        tag2 = new ArrayList<>();
        tag2.add("어린이");
        tag2.add("어린이메뉴");

        tag3 = new ArrayList<>();
        tag3.add("반려동물");
        tag3.add("반려동물 동반가능");

        store = new Store(3L, "프랑제리 켄싱턴리조트 중문점","126.417796", "33.2448109", "복합 어뮤즈먼트 파티",
                "제주 서귀포시 중문관광로72번길 29-29", "0507-1391-9107", "09:00",
                "23:00", null, null, tag1, tag2, tag3,  "베이커리" );

        nearStores.add(store);
    }

    // 검색기능
    public List<Store> Search(String location, int pageNum, int size, Boolean tag0, Boolean tag1, Boolean tag2) {

        return nearStores.stream()
                .filter(store -> store.address.contains(location))
                .filter(store -> store.ta)
                .skip((pageNum - 1) * size)
                .limit(size)
                .collect(Collectors.toList());
    }



}
