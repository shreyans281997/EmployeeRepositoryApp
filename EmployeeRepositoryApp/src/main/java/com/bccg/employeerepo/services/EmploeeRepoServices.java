package com.bccg.employeerepo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bccg.employeerepo.beans.Employee;
import com.bccg.employeerepo.dao.EmployeeDao;

public class EmploeeRepoServices implements IEmployeeServices{
	@Autowired
	EmployeeDao daoServices;
	@Override
	public String addEmployee(Employee employee) {
		daoServices.save(employee);
		return "Employee added";
	}

	@Override
	public Employee getEmployeeDetails(Integer eId) {
		return daoServices.findById(eId).orElseThrow(null);
	}

	@Override
	public List<Employee> showAllEMployee() {
		return daoServices.findAll();
	}

	@Override
	public boolean deleteEmployee(Integer eId) {
		daoServices.deleteById(eId);
		return true;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return daoServices.save(employee);
	}

}
