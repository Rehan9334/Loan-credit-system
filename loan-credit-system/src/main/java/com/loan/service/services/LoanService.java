package com.loan.service.services;

import org.springframework.stereotype.Service;

import com.loan.service.dao.LoanRequestDTO;
import com.loan.service.entity.LoanApplications;
import com.loan.service.entity.User;
import com.loan.service.external.CreditScoreClient;
import com.loan.service.repository.LoanApplicationsRepository;
import com.loan.service.repository.UserRepository;

@Service
public class LoanService {

	private final UserRepository userRepository;
    private final LoanApplicationsRepository loanRepo;
    private final CreditScoreClient creditScoreClient;
    private final LoanRuleEngine ruleEngine;
    
    
	
    
    public LoanService(UserRepository userRepository, LoanApplicationsRepository loanRepo,
			CreditScoreClient creditScoreClient, LoanRuleEngine ruleEngine) {
		super();
		this.userRepository = userRepository;
		this.loanRepo = loanRepo;
		this.creditScoreClient = creditScoreClient;
		this.ruleEngine = ruleEngine;
	}


    public LoanApplications getLoanStatus(Long loanId) {
	    return loanRepo.findById(loanId)
	            .orElseThrow(() -> new RuntimeException("Loan not found"));
	}


	public LoanApplications applyLoan(LoanRequestDTO request) {
    	User user=new User();
    	user.setFullname(request.getFullname());
    	user.setPanNumber(request.getPanNumber());
    	user.setEmail(request.getEmail());
    	user.setAnnualIncome(request.getAnnualIncome());
    	
    	user=userRepository.save(user);
    	
    	Integer score =
                creditScoreClient.getCreditScore(request.getPanNumber());

        String decision =
                ruleEngine.evaluate(score, request.getAnnualIncome());
    	
    	LoanApplications loan=new LoanApplications();
    	loan.setLoanAmount(request.getLoanAmount());
    	loan.setTenureMonths(request.getTenureMonths());
    	loan.setCreditScore(score);
    	loan.setStatus(decision);
    	loan.setUser(user);
    	
    	return loanRepo.save(loan);
    	
    	

    }
}
