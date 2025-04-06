package com.btphat.spicynoodles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/home")
	public String home() {
		return "index.html";
	}
	
	@RequestMapping("/user")
	public String user() {
		return "user/index.html";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login.html";
	}
}
