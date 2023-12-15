package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.QuizMod;

@Service
public interface QuizContentService {
	List<QuizMod> select();
	public int score(List<QuizMod> data , List<String> answer);
}
