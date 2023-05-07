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


    @PostMapping("/review/regist")
    public ReviewDto writeReview(ReviewDto reviewDto){
        //Todo
        return reviewDto;
    }

    @DeleteMapping("/review/{reviewId}/delete")
    public void deleteReview(@PathVariable("reviewId") String reviewId){

    }

    @PutMapping("/review/{reviewId}/modify")
    public ReviewDto modifyReview(@PathVariable("reviewId") String reviewId, ReviewDto reviewDto){

        return reviewDto;
    }

}
