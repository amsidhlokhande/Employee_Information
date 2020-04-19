package com.amsidh.dto;

import java.io.Serializable;

public class EmployeeDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer empId;
	private String name;
	private Integer age;
	private Integer salary;
	private String address;

	public EmployeeDto() {

	}

	public EmployeeDto(Integer empId, String name, Integer age, Integer salary,
			String address) {
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}

	public EmployeeDto(String name, Integer age, Integer salary, String address) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
