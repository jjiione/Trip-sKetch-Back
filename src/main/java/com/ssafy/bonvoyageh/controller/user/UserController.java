package com.ssafy.bonvoyageh.controller.user;

import com.ssafy.bonvoyageh.model.user.UserDto;
import com.ssafy.bonvoyageh.service.user.UserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {


    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    private UserService userService;

    public UserController(UserService userService) {
        super();
        this.userService = userService;
    }

    @PutMapping("/modify")
    public String modify(UserDto userDto) {
        //Todo
        return null;
    }

    @GetMapping("/find-password")
    public String findPassword() {
        return "user/find-password";
    }

    @PutMapping("/modify-password")
    public String modifyPassword(UserDto userDto) {
        //Todo
        return null;
    }

    @GetMapping("/regist")
    public String join() {
        return "user/join";
    }

    @GetMapping("/regist/{userid}/id-check")
    @ResponseBody
    public String idCheck(@PathVariable("userid") String userId) throws Exception {
        logger.debug("idCheck userid : {}", userId);
        int cnt = userService.idCheck(userId);
        return cnt + "";
    }

    @PostMapping("/regist")
    public String join(@RequestBody UserDto userDto, Model model) {
        logger.debug("memberDto info : {}", userDto);
        try {
            userService.join(userDto);
            return "redirect:/user/login";
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("msg", "회원 가입 중 문제 발생!!!");
            return "error/error";
        }
    }

    @GetMapping("/login")
    public String login() {
        return "user/login";
    }

    @PostMapping("/login")
    public String login(@RequestParam Map<String, String> map, @RequestParam(name = "saveid", required = false) String saveid, Model model, HttpSession session, HttpServletResponse response) {
        logger.debug("login map : {}", map);
        try {
            UserDto userDto = userService.login(map);
            if(userDto != null) {
                session.setAttribute("userinfo", userDto);

                Cookie cookie = new Cookie("ssafy_id", map.get("userid"));
                cookie.setPath("/board");
                if("ok".equals(saveid)) {
                    cookie.setMaxAge(60*60*24*365*40);
                } else {
                    cookie.setMaxAge(0);
                }
                response.addCookie(cookie);
                return "redirect:/";
            } else {
                model.addAttribute("msg", "아이디 또는 비밀번호 확인 후 다시 로그인하세요!");
                return "user/login";
            }
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("msg", "로그인 중 문제 발생!!!");
            return "error/error";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }

    @GetMapping("/list")
    public String list() {
        return "redirect:/assets/list.html";
    }

}
