package com.ssafy.bonvoyageh.controller.mypage;

import com.ssafy.bonvoyageh.model.user.UserDto;
import com.ssafy.bonvoyageh.service.user.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mypage")
public class MypageController {

    private UserService userService;

    public MypageController(UserService userService){
        super();
        this.userService = userService;
    }

    @PutMapping("/userinfo")
    public void modifyUserinfo(@RequestBody UserDto userDto) throws Exception {
        userService.updateUser(userDto);
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
