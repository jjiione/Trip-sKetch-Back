package com.ssafy.bonvoyageh.model.review;

import lombok.Data;

@Data
public class ReviewDto {

    int reviewId;
    int placeId;
    String createTime;
    String content;
    float rate;
    String userId;

}
