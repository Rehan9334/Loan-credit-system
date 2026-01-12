package com.loan.service.dao;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class LoanRequestDTO {

	@NotBlank
    private String fullname;

    @NotBlank
    private String panNumber;

    @Email
    private String email;

    @NotNull
    @Min(10000)
    private Double loanAmount;

    @NotNull
    private Integer tenureMonths;

    @NotNull
    private Double annualIncome;
    
    public LoanRequestDTO() {}

	public LoanRequestDTO(@NotBlank String fullname, @NotBlank String panNumber, @Email String email,
			@NotNull @Min(10000) Double loanAmount, @NotNull Integer tenureMonths, @NotNull Double annualIncome) {
		super();
		this.fullname = fullname;
		this.panNumber = panNumber;
		this.email = email;
		this.loanAmount = loanAmount;
		this.tenureMonths = tenureMonths;
		this.annualIncome = annualIncome;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Integer getTenureMonths() {
		return tenureMonths;
	}

	public void setTenureMonths(Integer tenureMonths) {
		this.tenureMonths = tenureMonths;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}
    
    
}
