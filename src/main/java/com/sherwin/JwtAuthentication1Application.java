package com.sherwin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JwtAuthentication1Application {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "hello to AWS ";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JwtAuthentication1Application.class, args);
	}

}
