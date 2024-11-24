package com.example.demo.model;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("loginDTO")
public class LoginDTO {
	String userName;
	String userPw;
}
