package service;

import java.util.UUID;

import bo.EmployeeBO;
import dao.EmployeeDao;
import vo.Employee;

public class EmployeeService {

	private EmployeeDao empDao;
	
	
	public String createEmployee(Employee emp) {
		empDao = new EmployeeDao();
		return empDao.createEmployee(convertEmployeeBO(emp));
	}
	
	public static String generateIdForEmployee() {
		String[] uuid = UUID.randomUUID().toString().split("-");
		return uuid[0];
	}
	
	public static EmployeeBO convertEmployeeBO(Employee emp) {
		String id = generateIdForEmployee();
		return new EmployeeBO(id, emp.getName(),emp.getMobile(), emp.getCity());
	}
}
