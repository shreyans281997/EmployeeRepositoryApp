package com.bccg.employeerepo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bccg.employeerepo.beans.Employee;
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
