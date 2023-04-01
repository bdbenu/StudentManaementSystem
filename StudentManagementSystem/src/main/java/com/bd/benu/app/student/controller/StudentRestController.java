package com.bd.benu.app.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	
	@GetMapping("/test")
	public String apiTest() {
		
		return"API TESTED";
	}

}
