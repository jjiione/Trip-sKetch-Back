package com.ssafy.bonvoyageh.model.place;

import lombok.Data;

@Data
public class PlaceRecommendDto {
    int contentId;
    String title;
    String gugunName;
    String sidoName;
    private String imgSrc;
}
