package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// 1 -> 2 -> 12345 -> wait
		System.out.println(1);
		SpringApplication.run(DemoApplication.class, args);
		System.out.println(12345);
	}

	@Bean
	public CommandLineRunner runner(){
		return (String... args) -> {
			System.out.println(2);
		};
	}
}
