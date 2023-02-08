package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestResource {
	@GetMapping("/hello")
	public String getName() {
		
		return "Hola Mundo, Como estas!!";
	}
}
