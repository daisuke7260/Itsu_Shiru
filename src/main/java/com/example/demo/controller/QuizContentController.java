package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.QuizMod;
import com.example.demo.service.QuizContentService;

@Controller
public class QuizContentController {
	@Autowired
	QuizContentService quizContentService; 
	List<QuizMod> quiz;
	@GetMapping("/quizContent")
	public String quizContent(Model model) {
		
		quiz = quizContentService.select();
		model.addAttribute("quiz",quiz);
		return "quizContent";
	
	}
	
	@PostMapping("/postQuizContent")
	public String postTrivia(Model model,
			@RequestParam("userAnswers1") String UserAnswers1,
			@RequestParam("userAnswers2") String UserAnswers2,
			@RequestParam("userAnswers3") String UserAnswers3,
			@RequestParam("userAnswers4") String UserAnswers4,
			@RequestParam("userAnswers5") String UserAnswers5,
			@RequestParam("userAnswers6") String UserAnswers6,
			@RequestParam("userAnswers7") String UserAnswers7,
			@RequestParam("userAnswers8") String UserAnswers8,
			@RequestParam("userAnswers9") String UserAnswers9,
			@RequestParam("userAnswers10") String UserAnswers10){		
		List<String> userAnswers =new ArrayList<String>();
		userAnswers.add(UserAnswers1);
		userAnswers.add(UserAnswers2);
		userAnswers.add(UserAnswers3);
		userAnswers.add(UserAnswers4);
		userAnswers.add(UserAnswers5);
		userAnswers.add(UserAnswers6);
		userAnswers.add(UserAnswers7);
		userAnswers.add(UserAnswers8);
		userAnswers.add(UserAnswers9);
		userAnswers.add(UserAnswers10);
		int score = quizContentService.score(quiz,userAnswers);
		model.addAttribute("score",score);
		model.addAttribute("quiz",quiz);
		model.addAttribute("userAnswers",userAnswers);
		//回答結果表示ページ
		return "/postQuizContent";
	}

}
