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

    @GetMapping("/review/current/list")
    public List<ReviewShowDto> currentReview() throws Exception {
        return placeService.currentReview();
    }


    @PostMapping("/review/regist")
    public void writeReview(ReviewDto reviewDto) throws Exception {
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
    public Map<String, Object> sidoList() throws Exception {
        return placeService.sidoList();

    }

}
