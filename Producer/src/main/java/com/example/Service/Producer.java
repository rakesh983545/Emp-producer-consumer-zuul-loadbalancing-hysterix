package com.example.Service;

import java.util.ArrayList;

import com.example.pojo.Employee;

public class Producer {

	public static ArrayList<Employee> EmployeeDetails()
	{
		ArrayList<Employee> emp=new ArrayList<Employee>();
		
		emp.add(new Employee(1, "rak"));
		emp.add(new Employee(2, "raw"));
		emp.add(new Employee(3, "rae"));
		emp.add(new Employee(4, "rag"));
		emp.add(new Employee(5, "ray"));
		emp.add(new Employee(6, "raoi"));
		
		return emp;
		

		

	}

}
