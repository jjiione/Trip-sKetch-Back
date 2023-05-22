package com.ssafy.bonvoyageh.repository.place;

import com.ssafy.bonvoyageh.model.place.PlaceDetailDto;
import com.ssafy.bonvoyageh.model.place.PlaceDto;
import com.ssafy.bonvoyageh.model.place.PlaceRecommendDto;
import com.ssafy.bonvoyageh.model.place.category.ContentType12_AttractionDto;
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

    @Select("select p.place_id, p.title, s.sido_name, g.gugun_name\n" +
            "from places p join sido s \n" +
            "on p.sido_code = s.sido_code\n" +
            "join gugun g on s.sido_code = g.sido_code and g.gugun_code = p.gugun_code " +
            "where p.place_type = 12 order by rand() limit 3")
    List<PlaceRecommendDto> recommend() throws SQLException;

//    @Select("select * from attraction_detail_content_type_12 where contentid = #{placeId}")
    ContentType12_AttractionDto searchDetail(int placeId) throws SQLException;
//
//    ReviewDto writeReview(ReviewDto reviewDto) throws SQLException;
//
//    void deleteReview(@PathVariable("reviewId") String reviewId) throws SQLException;
//
//    ReviewDto modifyReview(@PathVariable("reviewId") String reviewId, ReviewDto reviewDto) throws SQLException;

}
