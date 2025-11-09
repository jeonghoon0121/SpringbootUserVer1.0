package com.org.userproject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserDTO userdto) {
        userService.registerUser(userdto);
        return ResponseEntity.ok("✅ 회원가입 완료");
    }

    @GetMapping("/{username}")
    public ResponseEntity<UserDTO> getUser(@PathVariable String username) {
        UserDTO userdto = userService.getUserByUsername(username);
        return ResponseEntity.ok(userdto);
    }
}

