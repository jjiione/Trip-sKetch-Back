package com.ssafy.bonvoyageh.service.place;

import com.ssafy.bonvoyageh.model.place.PlaceDetilaDto;
import com.ssafy.bonvoyageh.model.place.PlaceDto;

import java.util.List;

public interface PlaceService {
    List<PlaceDto> searchKeyword(String keyword) throws Exception;
    List<PlaceDetilaDto> searchDetail(int placeId)throws Exception;

}
