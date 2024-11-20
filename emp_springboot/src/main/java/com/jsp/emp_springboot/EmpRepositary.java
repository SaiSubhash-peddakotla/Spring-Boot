package com.jsp.emp_springboot;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepositary extends JpaRepository<Employee, Integer>{
	
}
