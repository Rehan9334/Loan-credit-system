package com.loan.service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



@Entity
@Table(name="loan_applications")
public class LoanApplications {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double loanAmount;

    private Integer tenureMonths;

    private String status; 
    // PENDING / APPROVED / REJECTED

    private Integer creditScore;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    
    public LoanApplications() {}

	public LoanApplications(Long id, Double loanAmount, Integer tenureMonths, String status, Integer creditScore,
			User user) {
		super();
		this.id = id;
		this.loanAmount = loanAmount;
		this.tenureMonths = tenureMonths;
		this.status = status;
		this.creditScore = creditScore;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(Integer creditScore) {
		this.creditScore = creditScore;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
    
    
}
