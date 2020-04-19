package com.amsidh.service;

import java.util.List;

import com.amsidh.dom.EmployeeDom;
import com.amsidh.dto.EmployeeDto;

public interface EmployeeService {
	public void addEmployee(EmployeeDto employeeDto);

	public List<EmployeeDto> listEmployeess();

	public EmployeeDto getEmployee(int empId);

	public void deleteEmployee(EmployeeDto employeeDto);
	
}
