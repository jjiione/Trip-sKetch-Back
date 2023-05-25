package com.ssafy.bonvoyageh.repository.place;

import com.ssafy.bonvoyageh.model.place.PlaceDetailDto;
import com.ssafy.bonvoyageh.model.place.PlaceDto;
import com.ssafy.bonvoyageh.model.place.PlaceRecommendDto;
import com.ssafy.bonvoyageh.model.place.category.ContentType12_AttractionDto;
import com.ssafy.bonvoyageh.model.review.ReviewDto;
import com.ssafy.bonvoyageh.model.review.ReviewShowDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Mapper
//@Repository
public interface PlaceDao {

    List<PlaceDto> searchKeyword(String keyword) throws SQLException;

    Map<String, Object> searchPlace(int placeId) throws SQLException;

    @Select("select p.content_id, p.title, s.sido_name, g.gugun_name, i.img_src\n" +
            "from places p join sido s \n" +
            "on p.sido_code = s.sido_code\n" +
            "join gugun g on s.sido_code = g.sido_code and g.gugun_code = p.gugun_code\n" +
            "left join place_images i on p.content_id = i.content_id\n" +
            "where p.content_type_id = 12 order by rand() limit 3")
    List<PlaceRecommendDto> recommend() throws SQLException;

//    @Select("select * from attraction_detail_content_type_12 where contentid = #{placeId}")
    ContentType12_AttractionDto searchDetail(int placeId) throws SQLException;

    List<String> placeImages(int placeId) throws SQLException;

    List<String> placeReviewImages(int placeId) throws SQLException;

    List<ReviewShowDto> currentReview() throws SQLException;
//
    void writeReview(ReviewDto reviewDto) throws SQLException;
//
//    void deleteReview(@PathVariable("reviewId") String reviewId) throws SQLException;
//
//    ReviewDto modifyReview(@PathVariable("reviewId") String reviewId, ReviewDto reviewDto) throws SQLException;

    List<Map<String, Object>> sidoList() throws SQLException;

    List<Map<String, Object>> gugunList(int sidoCode) throws SQLException;

    List<PlaceDto> searchLocation(Map<String, Object> param) throws SQLException;

    List<Map<String, Object>> cat1List() throws SQLException;

    List<Map<String, Object>> cat2List(String cat) throws SQLException;

    List<Map<String, Object>> cat3List(String cat) throws SQLException;

    List<Map<String, Object>> searchCat3(String cat3) throws SQLException;

    List<ReviewShowDto> myReview(String userId) throws SQLException;


}
