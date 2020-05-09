package dao;

import java.util.HashMap;
import java.util.Map;

import bo.EmployeeBO;
import vo.Employee;

public class EmployeeDao {

	static Map<String, EmployeeBO> empMap;
	
	public String createEmployee(EmployeeBO emp) {
		empMap = new HashMap<String, EmployeeBO>();
		empMap.put(emp.getName(), emp);
		return emp.getId();
	}
}
