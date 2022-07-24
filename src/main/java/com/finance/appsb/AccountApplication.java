package com.finance.appsb;

import java.util.List;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
	
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AccountApplication {


	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}
	@GetMapping(value="/hello")
	public String greeting() {
		return "Hellooo";
	}

}
