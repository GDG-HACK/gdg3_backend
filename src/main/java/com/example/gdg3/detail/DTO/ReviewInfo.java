package com.example.gdg3.detail.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
public class ReviewInfo {
    List<ReviewObject> reviewList;

    public ReviewInfo(List<ReviewObject> reviewList) {
        this.reviewList = reviewList;
    }
}
