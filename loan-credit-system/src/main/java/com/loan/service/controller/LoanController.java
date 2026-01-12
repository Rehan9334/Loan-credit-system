package com.loan.service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loan.service.dao.LoanRequestDTO;
import com.loan.service.entity.LoanApplications;
import com.loan.service.services.LoanService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/loans")
public class LoanController {

	private LoanService loanService;

	public LoanController(LoanService loanService) {
		super();
		this.loanService = loanService;
	}
	
	@PostMapping("/apply")
	public ResponseEntity<LoanApplications> applyLoan(@Valid @RequestBody LoanRequestDTO request){
		return ResponseEntity.ok(loanService.applyLoan(request));
	}
	@GetMapping("/{loanId}")
	public ResponseEntity<LoanApplications> getLoanStatus(
	        @PathVariable Long loanId) {

	    return ResponseEntity.ok(
	            loanService.getLoanStatus(loanId)
	    );
	}

}
