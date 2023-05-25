package com.ssafy.bonvoyageh.service.place;

import com.ssafy.bonvoyageh.model.place.PlaceDetailDto;
import com.ssafy.bonvoyageh.model.place.PlaceDto;
import com.ssafy.bonvoyageh.model.place.PlaceRecommendDto;
import com.ssafy.bonvoyageh.model.place.category.ContentType12_AttractionDto;
import com.ssafy.bonvoyageh.model.review.ReviewDto;
import com.ssafy.bonvoyageh.model.review.ReviewShowDto;
import com.ssafy.bonvoyageh.repository.place.PlaceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

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
    public Map<String, Object> searchPlace(int placeId) throws Exception {
        return placeDao.searchPlace(placeId);
    }

    @Override
    public List<PlaceRecommendDto> recommend() throws Exception {
        return placeDao.recommend();
    }

    @Override
    public List<String> placeImages(int placeId) throws Exception {
        return placeDao.placeImages(placeId);
    }

    @Override
    public List<String> placeReviewImages(int placeId) throws SQLException {
        return placeDao.placeReviewImages(placeId);
    }

    @Override
    public ContentType12_AttractionDto searchDetail(int placeId) throws Exception {
        return placeDao.searchDetail(placeId);
    }

    @Override
    public List<ReviewShowDto> currentReview() throws Exception {
        return placeDao.currentReview();
    }

    @Override
    public void writeReview(ReviewDto reviewDto) throws Exception {
         placeDao.writeReview(reviewDto);
    }

    @Override
    public void deleteReview(String reviewId) throws Exception {

    }

    @Override
    public ReviewDto modifyReview(String reviewId, ReviewDto reviewDto) throws Exception {
        return null;
    }

    @Override
    public List<Map<String, Object>> sidoList() throws Exception {
        return placeDao.sidoList();
    }

    @Override
    public List<Map<String, Object>> gugunList(int sidoCode) throws Exception {
        return placeDao.gugunList(sidoCode);
    }

    @Override
    public List<PlaceDto> searchLocation(Map<String, Object> param) throws Exception {
        return placeDao.searchLocation(param);
    }

    @Override
    public List<Map<String, Object>> cat1List() throws Exception {
        return placeDao.cat1List();
    }

    @Override
    public List<Map<String, Object>> cat2List(String cat) throws Exception {
        return placeDao.cat2List(cat);
    }

    @Override
    public List<Map<String, Object>> cat3List(String cat) throws Exception {
        return placeDao.cat3List(cat);
    }

    @Override
    public List<Map<String, Object>> searchCat3(String cat3) throws Exception {
        return placeDao.searchCat3(cat3);
    }
}
