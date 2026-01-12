package com.loan.service.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "credit-score-client", url = "http://localhost:1901")
public interface CreditScoreClient {

	@GetMapping("/external/credit-score")
    Integer getCreditScore(@RequestParam String panNumber);
}
