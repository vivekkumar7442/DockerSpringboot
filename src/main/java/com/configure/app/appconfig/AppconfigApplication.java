package com.configure.app.appconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")

public class AppconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppconfigApplication.class, args);
	}

}
