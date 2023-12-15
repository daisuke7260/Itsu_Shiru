package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuizMod {

	private Integer id;
	private String content;
	private String answer;
	private String explanation;
	private String category;
	private String field;
}
