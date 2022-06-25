package entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;


public class Store {
    public Long id;

    public String storeName;

    public String latitude;

    public String longitude;

    public String intro;

    public String address;

    public String phoneNum;

    public String openingTime;

    public String closingTime;

    public String breakingStart;

    public String breakingEnd;

    public List<String> storeTag1;

    public List<String> storeTag2;

    public List<String> storeTag3;

    public String categoryName;

    public Store(Long id, String storeName, String latitude, String longitude, String intro, String address, String phoneNum, String openingTime, String closingTime, String breakingStart, String breakingEnd, List<String> storeTag1, List<String> storeTag2, List<String> storeTag3, String categoryName) {
        this.id = id;
        this.storeName = storeName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.intro = intro;
        this.address = address;
        this.phoneNum = phoneNum;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.breakingStart = breakingStart;
        this.breakingEnd = breakingEnd;
        this.storeTag1 = storeTag1;
        this.storeTag2 = storeTag2;
        this.storeTag3 = storeTag3;
        this.categoryName = categoryName;
    }
}