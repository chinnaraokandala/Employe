package com.example.Employe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employe")
public class Employe {
	@Id
	private long empId;
	private String empName;
	private String empAdd;
	private long empSal;
	public Employe(long empId, String empName, String empAdd, long empSal) {
		
		this.empId = empId;
		this.empName = empName;
		this.empAdd = empAdd;
		this.empSal = empSal;
	}
	public Employe() {
		
		System.out.println("Emp is invoked");
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	public long getEmpSal() {
		return empSal;
	}
	public void setEmpSal(long empSal) {
		this.empSal = empSal;
	}
	
	
	
	

}
