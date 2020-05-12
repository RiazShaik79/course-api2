package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication

public class CourseApiApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(CourseApiApp.class, args);
	}
	
/*	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(CourseApiApp.class);
	} */

}
