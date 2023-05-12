package com.ssafy.bonvoyageh.service.place;

import com.ssafy.bonvoyageh.model.place.PlaceDetilaDto;
import com.ssafy.bonvoyageh.model.place.PlaceDto;
import com.ssafy.bonvoyageh.model.review.ReviewDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlaceServiceImpl implements PlaceService{
    @Override
    public List<PlaceDto> searchKeyword(String keyword) throws Exception {
        return null;
    }

    @Override
    public List<PlaceDetilaDto> searchDetail(int placeId) throws Exception {
        return null;
    }

    @Override
    public ReviewDto writeReview(ReviewDto reviewDto) throws Exception {
        return null;
    }

    @Override
    public void deleteReview(String reviewId) throws Exception {

    }

    @Override
    public ReviewDto modifyReview(String reviewId, ReviewDto reviewDto) throws Exception {
        return null;
    }
}
