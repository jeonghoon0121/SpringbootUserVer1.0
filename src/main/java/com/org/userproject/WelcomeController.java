package com.org.userproject;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome(HttpSession session, Model model) {
        UserDTO user = (UserDTO) session.getAttribute("loggedInUser");

        if (user != null) {
            model.addAttribute("user", user);
            return "welcome";
        } else {
            return "redirect:/"; // 로그인 안 된 경우 홈으로
        }
    }
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate(); // 세션 초기화
        return "redirect:/";
    }

}
