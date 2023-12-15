package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class TestController {

	@GetMapping("/test")
	public String test(Model model) {
		return "test";
	}

}
