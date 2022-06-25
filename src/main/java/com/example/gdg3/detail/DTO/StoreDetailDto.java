package com.example.gdg3.detail.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter
@ToString
public class StoreDetailDto {
    private Long shopCount;

    private StoreInfo storeInfo;

    private MenuInfo menuInfo;

    private Long reviewCount;

    private ReviewInfo reviewInfo;

}
