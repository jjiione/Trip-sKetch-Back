package com.ssafy.bonvoyageh.model.plan;

import lombok.Data;

import java.sql.Date;

@Data
public class PlanDetailDto {
    private int planDetailId;
    private int planId;
    private int placeId;
    private String date;
}
