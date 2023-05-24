package com.ssafy.bonvoyageh.model.review;

import lombok.Data;

@Data
public class ReviewShowDto {
    int reviewId;
    String title;
    int placeId;
    String createTime;
    String content;
    float rate;
    String userId;
}
