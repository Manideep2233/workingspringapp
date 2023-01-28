package com.azure.deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin("*")
public class SpringAzureDemoApplication {

	@GetMapping("/message")
	public String message(){
		return "Congrats ! your application deployed successfully in Azure Platform. !";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoApplication.class, args);
	}


	@GetMapping("/list")
	public String list(){
		return "list!";
	}

}
