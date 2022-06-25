package com.example.gdg3.detail.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
public class ReviewInfo {
    private String nickname;

    private List<String> tags;

    private String content;

    private String createdAt;

}
