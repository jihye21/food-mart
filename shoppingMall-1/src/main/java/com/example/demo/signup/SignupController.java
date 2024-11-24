package com.example.demo.signup;

import java.io.Console;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.email.EmailSendService;
import com.example.demo.signup.service.accountRegistService;

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
	
	@Autowired
	accountRegistService accountRegistService;
	
	@PostMapping("createAccount")
	public String createAccount(@RequestParam String name, @RequestParam String password1) {
		accountRegistService.execute(name, password1);
		return "redirect:/";
	}
}
