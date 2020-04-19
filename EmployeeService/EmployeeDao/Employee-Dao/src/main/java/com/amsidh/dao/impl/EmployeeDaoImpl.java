package com.amsidh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amsidh.dao.EmployeeDao;
import com.amsidh.dom.EmployeeDom;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public EmployeeDaoImpl() {
		System.out.println("Loading EmployeeDaoImpl class");
	}

	public void addEmployee(EmployeeDom employee) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(employee);
		session.getTransaction().commit();
		session.close();
	}

	public void deleteEmployee(EmployeeDom employee) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.createQuery(
						"DELETE FROM Employee where empId="
								+ employee.getEmpId()).executeUpdate();
		session.getTransaction().commit();
		session.close();
		
	}

	public EmployeeDom getEmployee(int empId) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		EmployeeDom employee = (EmployeeDom)session.get(EmployeeDom.class, empId);
		session.getTransaction().commit();
		session.close();
		return employee;
	}

	@SuppressWarnings("unchecked")
	public List<EmployeeDom> listEmployeess() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		List<EmployeeDom> employeeList=session.createCriteria(EmployeeDom.class).list();
		session.getTransaction().commit();
		session.close();
		return employeeList;
		
	}

}
