package com.ssafy.bonvoyageh.model.place;

import lombok.Data;

@Data
public class PlaceDto{
    int contentId;
    int sidoCode;
    int gugunCode;
    String title;
    int contentTypeId;
    private double latitude;
    private double longitude;


}
