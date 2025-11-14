package com.org.userproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        Model model) {
        UserDTO user = userService.getUserByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            model.addAttribute("user", user);
            return "welcome"; // 로그인 성공 시 이동할 페이지
        } else {
            model.addAttribute("error", "아이디 또는 비밀번호가 틀렸습니다.");
            return "index"; // 로그인 실패 시 다시 index.html
        }
    }
}

