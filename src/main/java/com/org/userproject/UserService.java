package com.org.userproject;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public void registerUser(UserDTO userDTO) {
        // TODO: 비밀번호 암호화 처리 가능
        userMapper.insertUser(userDTO);
    }

    public UserDTO getUserByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}

