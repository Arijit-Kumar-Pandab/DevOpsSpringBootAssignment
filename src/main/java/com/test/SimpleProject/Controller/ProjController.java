package com.test.SimpleProject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello world";
	}

}
