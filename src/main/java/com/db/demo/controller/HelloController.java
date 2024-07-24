package com.db.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//	view output at: 
//  http://localhost:8080/hello
	
	@GetMapping("hello")
	public String hello() {
		System.out.println("Hello");
		return "Hello world!";
	}

}
