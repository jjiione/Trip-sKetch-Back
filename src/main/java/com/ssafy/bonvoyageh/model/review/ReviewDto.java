package com.ssafy.bonvoyageh.model.review;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class ReviewDto {

    int reviewId;
    int placeId;
    Timestamp createTime;
    String content;
    float rate;
    String userId;

}
