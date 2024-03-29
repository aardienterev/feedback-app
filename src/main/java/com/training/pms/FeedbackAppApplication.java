package com.training.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FeedbackAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeedbackAppApplication.class, args);
	}

	@GetMapping("/getFeedback")
	public String getFeedback()
	{
		return "I want to commit die...";
	}
	
	@GetMapping("/sayBye")
	public String sayBye()
	{
		return "Bye bye!";
	}
	
	@GetMapping("/boredom")
	public String boredom()
	{
		return "This isn't entertaining. Can I write code now plz.";
	}
}
