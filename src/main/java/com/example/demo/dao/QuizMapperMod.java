package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.dto.QuizMod;

@Mapper
public interface QuizMapperMod {
	@Select("SELECT * FROM quiz LIMIT 10")
	List<QuizMod> select();

}
