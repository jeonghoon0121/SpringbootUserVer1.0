package com.org.userproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {

    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        Model model,
                        HttpSession session) {
        UserDTO user = userService.getUserByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            session.setAttribute("loggedInUser", user); // 세션에 사용자 정보 저장
            return "redirect:/welcome"; // 리다이렉트로 이동
        } else {
            model.addAttribute("error", "아이디 또는 비밀번호가 틀렸습니다.");
            return "index";
        }
    }

}

