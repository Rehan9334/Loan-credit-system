package com.loan.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loan.service.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	boolean existsByPanNumber(String panNumber);
}
