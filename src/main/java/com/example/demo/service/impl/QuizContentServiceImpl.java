package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.QuizMapperMod;
import com.example.demo.dto.QuizMod;
import com.example.demo.service.QuizContentService;

@Service
public class QuizContentServiceImpl implements QuizContentService{

	@Autowired
	QuizMapperMod quizMapperMod;
	
	public List<QuizMod> select(){
		return quizMapperMod.select();
	}
	
	public int score(List<QuizMod> data , List<String> answer) {
		int score= 0;
		int count=0;
		for(QuizMod dto : data) {
			String a = dto.getAnswer();
			String b = answer.get(count);
			if(a.equals(b)) {
				score+=10;
			}
			count++;
		}
		return score;
	}

}
