package com.kaladhar.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/greet")
	public ResponseEntity<String> greetMsg() {
		return ResponseEntity.ok("Hi Welcome Kaladhar to AWS & Docker");
	}
	
}
