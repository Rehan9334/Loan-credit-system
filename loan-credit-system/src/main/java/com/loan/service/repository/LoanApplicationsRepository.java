package com.loan.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loan.service.entity.LoanApplications;

public interface LoanApplicationsRepository extends JpaRepository
<LoanApplications, Long> {

}
