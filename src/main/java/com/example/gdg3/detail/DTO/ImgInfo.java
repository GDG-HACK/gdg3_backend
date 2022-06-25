package com.example.gdg3.detail.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
public class ImgInfo {

    private List<String> imgList;

    public ImgInfo(List<String> imgList) {
        this.imgList = imgList;
    }
}
