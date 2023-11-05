package com.coldrenatinho.lbd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class LbdApplication {

	public static void main(String[] args) {
		SpringApplication.run(LbdApplication.class, args);
	}

	@GetMapping
	public List<String> Hello(){
		return List.of("Hello", "Word");
	}
}
