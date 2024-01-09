package com.example.Employe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Employe.entity.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
	

}
