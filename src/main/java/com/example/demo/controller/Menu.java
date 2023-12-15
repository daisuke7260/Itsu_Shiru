package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Menu {

	@GetMapping("/menu")
	public String getTMenu(Model model) {

		return "/menu";
	}
}
