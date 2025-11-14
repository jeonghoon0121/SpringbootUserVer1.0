package com.org.userproject;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserDTO getUserByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}

