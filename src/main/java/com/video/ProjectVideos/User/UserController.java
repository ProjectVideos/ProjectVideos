package com.video.ProjectVideos.User;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @GetMapping("/")    //홈화면
    public String home(){
        return "index";
    }
    //---------------------------------------------------------------

    @GetMapping("/user/create")     //회원가입
    public String userCreate(){
        return "User/user_create";
    }

    @PostMapping("/user/create")
    public String userCreate2(User user, @RequestParam String password2){
//        if (!user.getPassword().equals(password2)) {
//            bindingResult.rejectValue("memberPw2", "passwordInCorrect", "2개의 패스워드가 일치하지 않습니다.");
//            return "Member/member_create";
        return "redirect:/user/create";
    }
}
