package com.amsidh.util;

import java.util.ArrayList;
import java.util.List;

import com.amsidh.bean.EmployeeBean;
import com.amsidh.dto.EmployeeDto;



public class EmployeeControllerHelper {

	public static EmployeeBean employeeDtoToEmployeeBean(EmployeeDto employeeDto) {
		EmployeeBean employeeBean = null;
		if (employeeDto != null) {
			if (employeeDto.getEmpId() != null) {
				employeeBean = new EmployeeBean(employeeDto.getEmpId(),
						employeeDto.getName(), employeeDto.getAge(),
						employeeDto.getSalary(), employeeDto.getAddress());
			} else {
				employeeBean = new EmployeeBean(employeeDto.getName(),
						employeeDto.getAge(), employeeDto.getSalary(),
						employeeDto.getAddress());
			}
		}
		return employeeBean;
	}

	public static List<EmployeeBean> employeeDtosToEmployeeBeans(
			List<EmployeeDto> employeeDtos) {
		List<EmployeeBean> employeeBeans = new ArrayList<EmployeeBean>();
		if (!employeeDtos.isEmpty()) {
			for (EmployeeDto employeeDto : employeeDtos) {

				if (employeeDto != null) {
					if (employeeDto.getEmpId() != null) {
						employeeBeans.add(new EmployeeBean(
								employeeDto.getEmpId(), employeeDto.getName(),
								employeeDto.getAge(), employeeDto.getSalary(),
								employeeDto.getAddress()));
					} else {
						employeeBeans.add(new EmployeeBean(employeeDto.getName(),
								employeeDto.getAge(), employeeDto.getSalary(),
								employeeDto.getAddress()));
					}
				}
			}

		}
		return employeeBeans;
	}

	public static EmployeeDto employeeBeanToEmployeeDto(EmployeeBean employeeBean) {
		EmployeeDto employeeDto = null;
		if (employeeBean != null) {
			if (employeeBean.getEmpId() != null) {
				employeeDto = new EmployeeDto(employeeBean.getEmpId(),
						employeeBean.getName(), employeeBean.getAge(),
						employeeBean.getSalary(), employeeBean.getAddress());
			} else {
				employeeDto = new EmployeeDto(employeeBean.getName(),
						employeeBean.getAge(), employeeBean.getSalary(),
						employeeBean.getAddress());
			}

		}

		return employeeDto;
	}

	public static List<EmployeeDto> employeeBeansToEmployeeDtos(
			List<EmployeeBean> employeeBeans) {
		List<EmployeeDto> employeeDtos = new ArrayList<EmployeeDto>();
		if (!employeeBeans.isEmpty()) {
			for (EmployeeBean employeeBean : employeeBeans) {

				if (employeeBean != null) {
					if (employeeBean.getEmpId() != null) {
						employeeDtos.add(new EmployeeDto(
								employeeBean.getEmpId(), employeeBean.getName(),
								employeeBean.getAge(), employeeBean.getSalary(),
								employeeBean.getAddress()));
					} else {
						employeeDtos.add(new EmployeeDto(employeeBean.getName(),
								employeeBean.getAge(), employeeBean.getSalary(),
								employeeBean.getAddress()));
					}
				}
			}

		}
		return employeeDtos;
	}
}
