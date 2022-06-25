package com.example.gdg3.search.DTO;

import com.example.gdg3.entity.Store;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class StoreItem {
    private String name;

    private String phoneNum;

    private String address;

    private float latitude;

    private float longitude;

    private List<String> shopTag1;

    private List<String> shopTag2;

    private List<String> shopTag3;

    private String openingHours;

    private String breakingHours;

    private String info;

    public String imgUrl;

    public StoreItem(Store store, String imgUrl) {
        this.name = store.getStoreName();
        this.phoneNum = store.getPhoneNum();
        this.address = store.getAddress();
        this.latitude = store.getLatitude();
        this.longitude = store.getLongitude();
        this.shopTag1 = List.of(store.getStoreTag1().split(";"));
        this.shopTag2 = List.of(store.getStoreTag2().split(";"));
        this.shopTag3 = List.of(store.getStoreTag3().split(";"));
        this.openingHours = String.valueOf(store.getOpeningTime()) + "~" + String.valueOf(store.getClosingTime());
        this.breakingHours = String.valueOf(store.getBreakingStart()) + "~" + String.valueOf(store.getBreakingEnd());
        this.info = store.getIntro();
        this.imgUrl = imgUrl;
    }
}
