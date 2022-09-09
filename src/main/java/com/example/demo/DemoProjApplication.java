package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class DemoProjApplication {

	@GetMapping(value="/sayhello/{name}")
	public String sayHello(@PathVariable String name) {
		return "Hello " + name;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoProjApplication.class, args);
		
	}

}
