package com.bccg.employeerepo.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private Integer eId;
	private String firstName;
	private String lastName;
	private String emailId;
	
}

