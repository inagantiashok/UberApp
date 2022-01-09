package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	@Value("${username1}")
	public String username1;

	@GetMapping(path = "/getdata")
	String getData() {
		return "inaganti ashok"+username1;
	}
	
	@GetMapping(path = "/")
	String getData1() {
		return "<h1>ingantiashok</h1>";
	}
}
