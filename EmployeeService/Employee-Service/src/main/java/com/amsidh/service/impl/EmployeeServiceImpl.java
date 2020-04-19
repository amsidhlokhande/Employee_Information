package com.amsidh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.amsidh.dao.EmployeeDao;
import com.amsidh.dto.EmployeeDto;
import com.amsidh.service.EmployeeService;
import com.amsidh.util.EmployeeServiceHelper;
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)  
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
		System.out.println("Loading EmployeeServiceImpl class");
	}
	
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addEmployee(EmployeeDto employeeDto) {
		System.out.println("Start");
		
		employeeDao.addEmployee(EmployeeServiceHelper.employeeDtoToEmployeeDom(employeeDto));

		System.out.println("End");
	}

	
	public void deleteEmployee(EmployeeDto employeeDto) {
		employeeDao.deleteEmployee(EmployeeServiceHelper.employeeDtoToEmployeeDom(employeeDto));

	}

	
	public EmployeeDto getEmployee(int empId) {
		return EmployeeServiceHelper.employeeDomToEmployeeDto(employeeDao.getEmployee(empId));
	}

	
	public List<EmployeeDto> listEmployeess() {
		
		
		return EmployeeServiceHelper.employeeDomsToEmployeeDtos(employeeDao.listEmployeess());
	}

}
