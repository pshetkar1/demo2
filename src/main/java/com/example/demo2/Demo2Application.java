package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;





@SpringBootApplication
@RestController
public class Demo2Application {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to Dockers Integration With Jenkins.";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

}
