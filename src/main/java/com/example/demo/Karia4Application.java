package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
@MapperScan("com.example.demo.dao")
@SpringBootApplication
public class Karia4Application extends SpringBootServletInitializer{
	
	public static void main(String[] args) {
		SpringApplication.run(Karia4Application.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	      return builder.sources(Karia4Application.class);
	}

}
