package com.ssafy.bonvoyageh.controller.place;

import com.ssafy.bonvoyageh.model.place.PlaceDetilaDto;
import com.ssafy.bonvoyageh.model.place.PlaceDto;
import com.ssafy.bonvoyageh.model.review.ReviewDto;
import com.ssafy.bonvoyageh.service.place.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("place")
public class PlaceController {
    private final PlaceService placeService;

    @Autowired
    public PlaceController(PlaceService placeService) {
        this.placeService = placeService;
    }

    @PutMapping("/{route}/modify")
    public String plans() {
        //Todo
        return "mypage/plans";
    }

    @GetMapping("/search")
    public List<PlaceDto> searchKeyword(@RequestParam String keyword) {
        List<PlaceDto> list = new ArrayList<>();


        return list;
    }

    @GetMapping("/{placeId}/detail")
    public List<PlaceDetilaDto> searchDetail(@PathVariable("placeid") int placeId) {
        List<PlaceDetilaDto> list = new ArrayList<>();
        return list;
    }

    @PostMapping("/register/route")
    public String makeRoute(){
        //Todo
        return "mypage/plans";
    }

    @DeleteMapping("/{placeId}/delete")
    public String deleteRoute(@PathVariable("placeid") String placeId){
        //Todo
        return "mypage/plans";
    }

    @PostMapping("/review/write")
    public String writeReview(ReviewDto reviewDto){
        //Todo
        return "mypage/plans";
    }

    @DeleteMapping("/review/{reviewId}/delete")
    public String deleteReview(@PathVariable("reviewId") String reviewId){
        //Todo
        return "mypage/plans";
    }

    @PutMapping("/review/{reviewId}/modify")
    public String modifyReview(@PathVariable("reviewId") String reviewId, ReviewDto reviewDto){
        //Todo
        return "mypage/plans";
    }

}
