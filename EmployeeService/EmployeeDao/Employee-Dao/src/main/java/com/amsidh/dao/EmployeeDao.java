package com.amsidh.dao;

import java.util.List;


import com.amsidh.dom.EmployeeDom;

public interface EmployeeDao {
	public void addEmployee(EmployeeDom employee);

	public List<EmployeeDom> listEmployeess();

	public EmployeeDom getEmployee(int empId);

	public void deleteEmployee(EmployeeDom employee);
	
}
