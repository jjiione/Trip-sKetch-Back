package com.ssafy.bonvoyageh.service.place;

import com.ssafy.bonvoyageh.model.place.PlaceDetailDto;
import com.ssafy.bonvoyageh.model.place.PlaceDto;
import com.ssafy.bonvoyageh.model.place.PlaceRecommendDto;
import com.ssafy.bonvoyageh.model.place.category.ContentType12_AttractionDto;
import com.ssafy.bonvoyageh.model.review.ReviewDto;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface PlaceService {
    List<PlaceDto> searchKeyword(String keyword) throws Exception;

    List<PlaceRecommendDto> recommend() throws Exception;

    ContentType12_AttractionDto searchDetail(int placeId)throws Exception;

    ReviewDto writeReview(ReviewDto reviewDto) throws Exception;

    void deleteReview(@PathVariable("reviewId") String reviewId) throws Exception;

    ReviewDto modifyReview(@PathVariable("reviewId") String reviewId, ReviewDto reviewDto) throws Exception;

}
