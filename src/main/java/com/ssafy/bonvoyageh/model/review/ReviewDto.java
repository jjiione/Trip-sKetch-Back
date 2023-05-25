package com.ssafy.bonvoyageh.model.review;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReviewDto {

    int reviewId;
    int placeId;
    String createTime;
    String content;
    float rate;
    String userId;
    String img;

    @Override
    public String toString() {
        return "ReviewDto{" +
                "reviewId=" + reviewId +
                ", placeId=" + placeId +
                ", createTime='" + createTime + '\'' +
                ", content='" + content + '\'' +
                ", rate=" + rate +
                ", userId='" + userId + '\'' +
                '}';
    }
}
