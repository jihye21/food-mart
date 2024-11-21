package com.example.demo.signup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.email.EmailSendService;

@Controller
@RequestMapping("signup")
public class SignupController {
	@GetMapping("signupPage")
	public String signupPage() {
		return "thymeleaf/signup/signupPage";
	}
	
	@Autowired
	EmailSendService emailSendService;
	
	@GetMapping("sendEmail")
	public String sendEmail() {
		return "";
	}
	
	@GetMapping("createAccount")
	public String createAccount1(@RequestParam("userID") String userId) {
		return "redirect:/";
	}
	@PostMapping("createAccount")
	public String createAccount() {
		return "redirect:/";
	}
}
