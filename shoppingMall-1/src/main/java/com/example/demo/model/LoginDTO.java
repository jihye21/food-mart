package com.example.demo.model;

<<<<<<< HEAD
import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("loginDTO")
public class LoginDTO {
	String userName;
	String userPw;
}
=======


import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Alias("loginDTO")
@Data
public class LoginDTO {
	String userId;
	String userPw;
	String userName;
	String userAddr;
	String userAddrDetail;
	String userPost;
	Number userPhone;
	String userEmail;
}	
>>>>>>> branch 'master' of https://github.com/jihye21/food-mart.git
