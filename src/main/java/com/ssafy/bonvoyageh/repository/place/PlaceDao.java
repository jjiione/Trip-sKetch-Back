package com.ssafy.bonvoyageh.repository.place;

import com.ssafy.bonvoyageh.model.place.PlaceDetailDto;
import com.ssafy.bonvoyageh.model.place.PlaceDto;
import com.ssafy.bonvoyageh.model.review.ReviewDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.sql.SQLException;
import java.util.List;

@Mapper
//@Repository
public interface PlaceDao {

    List<PlaceDto> searchKeyword(String keyword) throws SQLException;

    @Select("select * from places order by rand() limit 3")
    List<PlaceDto> recommend() throws SQLException;

//    List<PlaceDetailDto> searchDetail(int placeId)throws SQLException;
//
//    ReviewDto writeReview(ReviewDto reviewDto) throws SQLException;
//
//    void deleteReview(@PathVariable("reviewId") String reviewId) throws SQLException;
//
//    ReviewDto modifyReview(@PathVariable("reviewId") String reviewId, ReviewDto reviewDto) throws SQLException;

}
