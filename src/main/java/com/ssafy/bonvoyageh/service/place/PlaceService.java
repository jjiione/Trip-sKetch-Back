package com.ssafy.bonvoyageh.service.place;

import com.ssafy.bonvoyageh.model.place.PlaceDetailDto;
import com.ssafy.bonvoyageh.model.place.PlaceDto;
import com.ssafy.bonvoyageh.model.place.PlaceRecommendDto;
import com.ssafy.bonvoyageh.model.place.category.ContentType12_AttractionDto;
import com.ssafy.bonvoyageh.model.review.ReviewDto;
import com.ssafy.bonvoyageh.model.review.ReviewShowDto;
import org.springframework.web.bind.annotation.PathVariable;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface PlaceService {
    List<PlaceDto> searchKeyword(String keyword) throws Exception;

    Map<String, Object> searchPlace(int placeId) throws Exception;

    List<PlaceRecommendDto> recommend() throws Exception;

    List<String> placeImages(int placeId) throws Exception;

    List<String> placeReviewImages(int placeId) throws SQLException;

    ContentType12_AttractionDto searchDetail(int placeId)throws Exception;

    List<ReviewShowDto> currentReview() throws Exception;

    void writeReview(ReviewDto reviewDto) throws Exception;

    void deleteReview(@PathVariable("reviewId") String reviewId) throws Exception;

    ReviewDto modifyReview(@PathVariable("reviewId") String reviewId, ReviewDto reviewDto) throws Exception;

    List<Map<String, Object>> sidoList() throws Exception;

    List<Map<String, Object>> gugunList(int sidoCode) throws Exception;

    List<PlaceDto> searchLocation(Map<String, Object> param) throws Exception;

    List<Map<String, Object>> cat1List() throws Exception;
    List<Map<String, Object>> cat2List(String cat) throws Exception;
    List<Map<String, Object>> cat3List(String cat) throws Exception;
    List<Map<String, Object>> searchCat3(String cat3) throws Exception;

    List<ReviewShowDto> myReview(String userId) throws Exception;

}
