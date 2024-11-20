package com.jsp.emp_springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	@Autowired
	private EmpDao dao;
	@PostMapping("/save")
	public String save(@RequestBody Employee employee) {
		dao.save(employee);
		return "data saved inside db";
	}
}
