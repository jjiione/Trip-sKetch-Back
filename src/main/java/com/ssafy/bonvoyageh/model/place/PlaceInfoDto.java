package com.ssafy.bonvoyageh.model.place;

import lombok.Data;

@Data
public class PlaceInfoDto {
    private int contentId;
    private int contentTypeId;
    private String title;
    private String addr1;
    private String addr2;
    private String zipcode;
    private String tel;
    private String firstImage;
    private String firstImage2;
    private int readcount;
    private int sidoCode;
    private int gugunCode;
    private long latitude;
    private long longitude;
    private String mlevel;

}
