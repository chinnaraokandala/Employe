package com.example.Employe;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Employe.entity.Employe;
//import com.example.Employe.repository.EmployeRepository;
import com.example.Employe.sevice.EmployeService;

@SpringBootApplication
public class EmployeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeApplication.class, args);
	}

	@Bean
	CommandLineRunner testBackend(EmployeService empService) {
		
		Employe e =new Employe();
		e.setEmpId(123);
		e.setEmpName("chinna");
		e.setEmpAdd("Hyd");
		e.setEmpSal(20000);
		
		empService.add(e);
		
		return null;
		
		
	}
}
