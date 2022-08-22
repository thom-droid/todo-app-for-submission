package com.example.todoappforsubmission;

import com.example.todoappforsubmission.obj.Lunch;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.ModelAttribute;

@SpringBootApplication
public class TodoAppForSubmissionApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoAppForSubmissionApplication.class, args);
	}

	@Bean
	public Lunch lunch() {
		return new Lunch("sandwich");
	}

}
