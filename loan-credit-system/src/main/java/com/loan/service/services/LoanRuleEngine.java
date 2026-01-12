package com.loan.service.services;

import org.springframework.stereotype.Component;


@Component
public class LoanRuleEngine {

	public String evaluate(Integer creditScore, Double income) {

        if (creditScore >= 700 && income >= 300000) {
            return "APPROVED";
        }
        return "REJECTED";
    }
}
