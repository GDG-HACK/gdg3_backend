package com.example.gdg3.detail.DTO;

import com.example.gdg3.entity.Store;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
public class StoreInfo {
    private String name;

    private String phoneNum;

    private String address;

    private String latitude;

    private String longtitude;

    private List<String> shopTag1;

    private List<String> shopTag2;

    private List<String> shopTag3;

    private String openingHours;

    private String breakingHours;

    private String info;

    public StoreInfo(Store store) {
        this.name = store.getStoreName();
        this.phoneNum = store.getPhoneNum();
        this.address = store.getAddress();
        this.latitude = store.getLatitude();
        this.longtitude = store.getLongitude();
        this.shopTag1 = store.getStoreTag1() == null ? List.of("휠체어 사용자") : List.of(store.getStoreTag1().split(";"));
        this.shopTag2 = store.getStoreTag1() == null ? List.of("어린이") : List.of(store.getStoreTag2().split(";"));
        this.shopTag3 = store.getStoreTag1() == null ? List.of("반려동물") : List.of(store.getStoreTag3().split(";"));
        this.openingHours = String.valueOf(store.getOpeningTime()).equals("null") ? "" : String.valueOf(store.getOpeningTime()) + "~" + String.valueOf(store.getClosingTime());
        this.breakingHours = String.valueOf(store.getBreakingStart()).equals("null") ? "" : String.valueOf(store.getBreakingStart()) + "~" + String.valueOf(store.getBreakingEnd());
        this.info = store.getIntro();
    }
}
