package com.cust.pi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.cust.pi")
public class CustomerpiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerpiApplication.class, args);
	}

}
