package net.mithunmathew.springbootthymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.mithunmathew.springbootthymeleaf.entity.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	private List<Employee> employees;
	
	@PostConstruct
	private void loadEmployees() {
		
		// create employees
		Employee emp1 = new Employee(1, "Lewis", "Clark", "lewis@gmail.com");
		Employee emp2 = new Employee(2, "Michael", "Taylor", "michael@gmail.com");
		Employee emp3 = new Employee(3, "Rick", "Stewart", "ricky@gmail.com");
		
		// create the employee list
		employees = new ArrayList<>();
		
		// add into the employee list
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		
	}
	
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		
		// add employees to the Spring MVC model
		theModel.addAttribute("employees", employees);
		
		return "employee-list";
	}
}
