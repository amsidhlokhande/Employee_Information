package com.amsidh.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.amsidh.dom.EmployeeDom;
import com.amsidh.dto.EmployeeDto;

public class EmployeeServiceHelper {

	public static EmployeeDto employeeDomToEmployeeDto(EmployeeDom employeeDom) {
		EmployeeDto employeeDto = null;
		if (employeeDom != null) {
			if (employeeDom.getEmpId() != null) {
				employeeDto = new EmployeeDto(employeeDom.getEmpId(),
						employeeDom.getName(), employeeDom.getAge(),
						employeeDom.getSalary(), employeeDom.getAddress());
			} else {
				employeeDto = new EmployeeDto(employeeDom.getName(),
						employeeDom.getAge(), employeeDom.getSalary(),
						employeeDom.getAddress());
			}
		}
		return employeeDto;
	}

	public static List<EmployeeDto> employeeDomsToEmployeeDtos(
			List<EmployeeDom> employeeDoms) {
		List<EmployeeDto> employeeDtos = new ArrayList<EmployeeDto>();
		if (!employeeDoms.isEmpty()) {
			for (EmployeeDom employeeDom : employeeDoms) {

				if (employeeDom != null) {
					if (employeeDom.getEmpId() != null) {
						employeeDtos.add(new EmployeeDto(
								employeeDom.getEmpId(), employeeDom.getName(),
								employeeDom.getAge(), employeeDom.getSalary(),
								employeeDom.getAddress()));
					} else {
						employeeDtos.add(new EmployeeDto(employeeDom.getName(),
								employeeDom.getAge(), employeeDom.getSalary(),
								employeeDom.getAddress()));
					}
				}
			}

		}
		return employeeDtos;
	}

	public static EmployeeDom employeeDtoToEmployeeDom(EmployeeDto employeeDto) {
		EmployeeDom employeeDom = null;
		if (employeeDto != null) {
			if (employeeDto.getEmpId() != null) {
				employeeDom = new EmployeeDom(employeeDto.getEmpId(),
						employeeDto.getName(), employeeDto.getAge(),
						employeeDto.getSalary(), employeeDto.getAddress());
			} else {
				employeeDom = new EmployeeDom(employeeDto.getName(),
						employeeDto.getAge(), employeeDto.getSalary(),
						employeeDto.getAddress());
			}

		}

		return employeeDom;
	}

	public static List<EmployeeDom> employeeDtosToEmployeeDoms(
			List<EmployeeDto> employeeDtos) {
		List<EmployeeDom> employeeDoms = new ArrayList<EmployeeDom>();
		if (!employeeDtos.isEmpty()) {
			for (EmployeeDto employeeDto : employeeDtos) {

				if (employeeDto != null) {
					if (employeeDto.getEmpId() != null) {
						employeeDoms.add(new EmployeeDom(
								employeeDto.getEmpId(), employeeDto.getName(),
								employeeDto.getAge(), employeeDto.getSalary(),
								employeeDto.getAddress()));
					} else {
						employeeDoms.add(new EmployeeDom(employeeDto.getName(),
								employeeDto.getAge(), employeeDto.getSalary(),
								employeeDto.getAddress()));
					}
				}
			}

		}
		return employeeDoms;
	}

}
