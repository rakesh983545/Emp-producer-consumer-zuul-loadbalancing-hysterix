package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.Producer;
import com.example.pojo.Employee;

@RestController

public class ProducerController {

	@RequestMapping(value="/employee")
	public ArrayList<Employee> producer1()
	{
		ArrayList<Employee> al=new ArrayList<Employee>();
		al=Producer.EmployeeDetails();
		return al;
	}
}
