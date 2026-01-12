package com.loan.service.external;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/external")
public class CreditScoreMockController {

	@GetMapping("/credit-score")
    public Integer getScore(@RequestParam String panNumber) {

        // Mock logic
        if (panNumber.endsWith("F"))
            return 750;
        else
            return 600;
	}
}
