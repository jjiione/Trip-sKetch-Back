package com.ssafy.bonvoyageh.controller.place;

import com.ssafy.bonvoyageh.model.review.ReviewDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("place")
public class PlaceController {

    @PutMapping("/{route}/modify")
    public String plans() {
        //Todo
        return "mypage/plans";
    }

    @GetMapping("/search")
    public String search() {
        //Todo
        return "mypage/plans";
    }

    @GetMapping("/{placeid}/detail")
    public String search(@PathVariable("placeid") String placeId) {
        //Todo
        return "mypage/plans";
    }

    @PostMapping("/makeroute")
    public String makeRoute(){
        //Todo
        return "mypage/plans";
    }

    @DeleteMapping("/{placeid}/delete")
    public String deleteRoute(@PathVariable("placeid") String placeId){
        //Todo
        return "mypage/plans";
    }

    @PostMapping("/review/write")
    public String writeReview(ReviewDto reviewDto){
        //Todo
        return "mypage/plans";
    }

    @DeleteMapping("/review/{reviewid}/delete")
    public String deleteReview(@PathVariable("reviewid") String reviewId){
        //Todo
        return "mypage/plans";
    }

    @PutMapping("/review/{reviewid}/modify")
    public String modifyReview(@PathVariable("reviewid") String reviewId, ReviewDto reviewDto){
        //Todo
        return "mypage/plans";
    }

}
