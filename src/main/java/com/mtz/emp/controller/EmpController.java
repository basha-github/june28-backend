package com.mtz.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mtz.emp.model.Employee;
import com.mtz.emp.service.EmpService;

@RestController
@CrossOrigin("*")
public class EmpController {
	
	@Autowired
	EmpService empService;

	
	@PostMapping("/mtz/emp/add")
	public Employee addNewEmp(@RequestBody Employee emp){ 
		
		System.out.println(emp);
		
		
		return empService.saveNewEmp(emp);
	}
	
}
