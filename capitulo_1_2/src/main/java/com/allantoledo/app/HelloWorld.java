package com.allantoledo.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class HelloWorld {
	@GetMapping("/{txt}")
	public String helloWorld(@PathVariable String txt) {
		return txt;
	}
}
