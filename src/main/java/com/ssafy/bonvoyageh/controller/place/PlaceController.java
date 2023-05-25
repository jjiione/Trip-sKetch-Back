package com.ssafy.bonvoyageh.controller.place;

import com.ssafy.bonvoyageh.model.place.PlaceDetailDto;
import com.ssafy.bonvoyageh.model.place.PlaceDto;
import com.ssafy.bonvoyageh.model.place.PlaceRecommendDto;
import com.ssafy.bonvoyageh.model.place.category.ContentType12_AttractionDto;
import com.ssafy.bonvoyageh.model.review.ReviewDto;
import com.ssafy.bonvoyageh.model.review.ReviewShowDto;
import com.ssafy.bonvoyageh.service.place.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("place")
public class PlaceController {
    private final PlaceService placeService;

    @Autowired
    public PlaceController(PlaceService placeService) {
        this.placeService = placeService;
    }


    @GetMapping("/search/{placeId}/place")
    public Map<String, Object>  searchPlace(@PathVariable("placeId") int placeId) throws Exception{
        Map<String, Object> list =  placeService.searchPlace(placeId);
        System.out.println(list);
        return list;
    }



    @GetMapping("/search/{keyword}")
    public List<PlaceDto> searchKeyword(@PathVariable("keyword") String keyword) throws Exception {
        List<PlaceDto> list = placeService.searchKeyword(keyword);
        System.out.println(list);


        return list;
    }

    @GetMapping("/recommend")
    public List<PlaceRecommendDto> recommend() throws Exception{
        List<PlaceRecommendDto> list = placeService.recommend();
        return list;
    }

    @GetMapping("/{placeId}/detail")
    public ContentType12_AttractionDto searchDetail(@PathVariable("placeId") int placeId) throws Exception {
        ContentType12_AttractionDto dto = placeService.searchDetail(placeId);
        return dto;
    }

    @GetMapping("/{placeId}/images")
    public List<String> placeImages(@PathVariable("placeId") int placeId) throws Exception{
        return placeService.placeImages(placeId);
    }

    @GetMapping("/{placeId}/images/review")
    public List<String> placeReviewImages(@PathVariable("placeId") int placeId) throws Exception{
        return placeService.placeReviewImages(placeId);
    }

    @GetMapping("/review/current/list")
    public List<ReviewShowDto> currentReview() throws Exception {
        return placeService.currentReview();
    }


    @PostMapping("/review/regist")
    public void writeReview(@RequestBody ReviewDto reviewDto) throws Exception {
        System.out.println(reviewDto.toString());
        placeService.writeReview(reviewDto);
    }

    @DeleteMapping("/review/{reviewId}/delete")
    public void deleteReview(@PathVariable("reviewId") String reviewId){

    }

    @PutMapping("/review/{reviewId}/modify")
    public ReviewDto modifyReview(@PathVariable("reviewId") String reviewId, ReviewDto reviewDto){

        return reviewDto;
    }

    @GetMapping("/sido/list")
    public List<Map<String, Object>> sidoList() throws Exception {
        return placeService.sidoList();

    }

    @GetMapping("/gugun/{sido_code}/list")
    public List<Map<String, Object>> gugunList(@PathVariable("sido_code") int sidoCode) throws Exception {
        return placeService.gugunList(sidoCode);

    }

    @GetMapping("/search/location/{sido_code}/{gugun_code}")
    public List<PlaceDto> searchLocation(@PathVariable("sido_code") int sidoCode, @PathVariable("gugun_code") int gugunCode) throws Exception {
        Map<String, Object> param = new HashMap<>();
        param.put("sidoCode", sidoCode);
        param.put("gugunCode", gugunCode);

        return placeService.searchLocation(param);
    }

    @GetMapping("/search/category1/list")
    public List<Map<String, Object>> cat1List() throws Exception {
        return placeService.cat1List();
    }

    @GetMapping("/search/category2/{cat}/list")
    public List<Map<String, Object>> cat2List(@PathVariable("cat") String cat) throws Exception {
        return placeService.cat2List(cat);
    }

    @GetMapping("/search/category3/{cat}/list")
    public List<Map<String, Object>> cat3List(@PathVariable("cat") String cat) throws Exception {
        return placeService.cat3List(cat);
    }

    @GetMapping("/search/category/{cat3}/list")
    public List<Map<String, Object>> searchCat3(@PathVariable("cat3") String cat3) throws Exception{
        return placeService.searchCat3(cat3);
    }

}
