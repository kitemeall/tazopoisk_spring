package com.example.tazopoisk;

import com.example.tazopoisk.Config.JpaConfig;
import com.example.tazopoisk.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	@Autowired
	DataRepository dataRepository;

	public static void main(String[] args) {
		SpringApplication.run(new Class[]{Application.class, JpaConfig.class}, args);


	}
}
