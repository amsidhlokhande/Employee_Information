package com.amsidh.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.amsidh.bean.EmployeeBean;
import com.amsidh.service.EmployeeService;
import com.amsidh.util.EmployeeControllerHelper;

@Controller
@SessionAttributes
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	public EmployeeController() {
		System.out.println("Loading EmployeeController class");
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView welCome() {
		System.out.println("Inside Welcome Method");
		return new ModelAndView("index");
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveEmployee(
			@ModelAttribute(value = "employee") EmployeeBean employeeBean,
			BindingResult result) {
		System.out.println("Inside Save method");
		employeeService.addEmployee(EmployeeControllerHelper.employeeBeanToEmployeeDto(employeeBean));
		return new ModelAndView("redirect:/add.html");
	}

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public ModelAndView listEmployees() {
		System.out.println("Inside listEmployees method");
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("employees", EmployeeControllerHelper.employeeDtosToEmployeeBeans(employeeService.listEmployeess()));
		return new ModelAndView("employeesList", model);
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addEmployee(@ModelAttribute(value = "employee") EmployeeBean employee,
			BindingResult result) {
		System.out.println("Inside addEmployee method");
		//model.addObject("employees", prepareListofBean(employeeService.listEmployeess()));
		employee=new EmployeeBean();
		ModelAndView model=new ModelAndView();
		model.addObject("employees", EmployeeControllerHelper.employeeDtosToEmployeeBeans(employeeService.listEmployeess()));
		model.setViewName("addEmployee");
		return model ;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(
			@ModelAttribute(value = "employee") EmployeeBean employeeBean,
			BindingResult result) {
		System.out.println("Inside editEmployee method");
		employeeService.deleteEmployee(EmployeeControllerHelper.employeeBeanToEmployeeDto(employeeBean));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("employee", new EmployeeBean());
		model.put("employees", EmployeeControllerHelper.employeeDtosToEmployeeBeans(employeeService.listEmployeess()));
		return new ModelAndView("addEmployee", model);
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editEmployee(
			@ModelAttribute("employee") EmployeeBean employeeBean,
			BindingResult result) {
		System.out.println("Inside deleteEmployee method");
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("employee", EmployeeControllerHelper.employeeDtoToEmployeeBean(employeeService.getEmployee(employeeBean.getEmpId())));
		model.put("employees",  EmployeeControllerHelper.employeeDtosToEmployeeBeans(employeeService.listEmployeess()));
		return new ModelAndView("addEmployee", model);

	}

	
}
