package com.parthik.beans;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Employee {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empno;
	private String name;
	private int salary;
	
	@Embedded
	private Address addr;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empno, String name, int salary, Address addr) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + ", addr=" + addr + "]";
	}
	
	
	
}
