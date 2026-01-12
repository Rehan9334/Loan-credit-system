package com.loan.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LoanCreditSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanCreditSystemApplication.class, args);
	}

}
