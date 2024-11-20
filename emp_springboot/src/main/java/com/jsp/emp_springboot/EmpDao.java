package com.jsp.emp_springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDao {
	@Autowired
	private EmpRepositary empRepositary;
	
	public void save(Employee emp) {
		empRepositary.save(emp);
	}
}
	
