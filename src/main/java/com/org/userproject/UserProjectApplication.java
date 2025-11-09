package com.org.userproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.org.userproject") // UserMapper가 있는 패키지
public class UserProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserProjectApplication.class, args);
    }

}
