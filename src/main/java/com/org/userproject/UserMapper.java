package com.org.userproject;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    UserDTO findByUsername(String username);
}


