package com.example.Employe.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employe.entity.Employe;
import com.example.Employe.repository.EmployeRepository;

@Service
public class EmployeService {
	
	@Autowired
	EmployeRepository employerepository;	
	
	 public String add(Employe employe) {
		employerepository.save(employe);
		return "invoked";
	}

}
