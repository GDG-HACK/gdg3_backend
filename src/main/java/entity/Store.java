package entity;

import javax.persistence.*;
import java.sql.Time;

@Entity
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_id")
    private Long id;

    // @Column(name = "store_name")
    private String storeName;

    private String latitude;


    private String longitude;

    private String intro;

    private String address;

    private String phoneNum;

    private Time openingTime;

    private Time closingTime;

    private Time breakingStart;

    private Time breakingEnd;

    private String storeTag1;

    private String storeTag2;

    private String storeTag3;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Time getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(Time openingTime) {
        this.openingTime = openingTime;
    }

    public Time getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(Time closingTime) {
        this.closingTime = closingTime;
    }

    public Time getBreakingStart() {
        return breakingStart;
    }

    public void setBreakingStart(Time breakingStart) {
        this.breakingStart = breakingStart;
    }

    public Time getBreakingEnd() {
        return breakingEnd;
    }

    public void setBreakingEnd(Time breakingEnd) {
        this.breakingEnd = breakingEnd;
    }

    public String getStoreTag1() {
        return storeTag1;
    }

    public void setStoreTag1(String storeTag1) {
        this.storeTag1 = storeTag1;
    }

    public String getStoreTag2() {
        return storeTag2;
    }

    public void setStoreTag2(String storeTag2) {
        this.storeTag2 = storeTag2;
    }

    public String getStoreTag3() {
        return storeTag3;
    }

    public void setStoreTag3(String storeTag3) {
        this.storeTag3 = storeTag3;
    }
}
