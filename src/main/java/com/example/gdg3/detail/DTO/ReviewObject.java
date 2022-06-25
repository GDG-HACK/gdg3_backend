package com.example.gdg3.detail.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
public class ReviewObject {
    private String nickname;

    private List<String> tags;

    private String content;

    private String createdAt;

    public ReviewObject(String nickname, String reviewTags, String content, String createdAt) {
        this.nickname = nickname;
        this.tags = reviewTags == null ? null : List.of(reviewTags.split(";"));
        this.content = content;
        this.createdAt = createdAt;
    }
}
