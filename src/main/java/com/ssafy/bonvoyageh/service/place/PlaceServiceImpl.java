package com.ssafy.bonvoyageh.service.place;

import com.ssafy.bonvoyageh.model.place.PlaceDetailDto;
import com.ssafy.bonvoyageh.model.place.PlaceDto;
import com.ssafy.bonvoyageh.model.review.ReviewDto;
import com.ssafy.bonvoyageh.repository.place.PlaceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlaceServiceImpl implements PlaceService{

    private final  PlaceDao placeDao;

    @Autowired
    public PlaceServiceImpl(PlaceDao placeDao) {
        this.placeDao = placeDao;
    }

    @Override
    public List<PlaceDto> searchKeyword(String keyword) throws Exception {
//        System.out.println("service start");

        return placeDao.searchKeyword(keyword);
    }

    @Override
    public List<PlaceDto> recommend() throws Exception {
        return placeDao.recommend();
    }

    @Override
    public List<PlaceDetailDto> searchDetail(int placeId) throws Exception {
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
