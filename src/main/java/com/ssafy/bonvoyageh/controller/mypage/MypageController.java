package com.ssafy.bonvoyageh.controller.mypage;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/mypage")
public class MypageController {

    @GetMapping("/userinfo")
    public String userinfo() {
        return "mypage/join";
    }

    @GetMapping("/reviews")
    public String reviews() {
        return "mypage/reviews";
    }

    @GetMapping("/plans")
    public String plans() {
        return "mypage/plans";
    }

    @DeleteMapping("/plan/{planid}/delete")
    public String plans(@PathVariable("planid") String planId) {
        return "";
    }

}
