package com.bccg.employeerepo.services;
import java.util.List;

import com.bccg.employeerepo.beans.Employee;
public interface IEmployeeServices {
public String addEmployee(Employee employee);
public Employee getEmployeeDetails(Integer eId);
public List<Employee> showAllEMployee();
public boolean deleteEmployee(Integer eId);
public Employee updateEmployee(Employee employee);
}
