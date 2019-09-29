package com.taofeng.arithmetic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ArithmeticApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArithmeticApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		return "我是乐陶";
	}

}
