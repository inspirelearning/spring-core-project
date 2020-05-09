package controller;

import service.EmployeeService;
import vo.Employee;

public class EmployeeController {
	
	private EmployeeService empService;
	
	public String createEmployee(Employee emp) {
		empService = new EmployeeService();
		return empService.createEmployee(emp);
	}

}
