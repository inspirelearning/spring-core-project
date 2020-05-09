package main;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import controller.EmployeeController;
import vo.Employee;

public class Main {
	
    Employee emp;
    EmployeeController empController;
	Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		Main main = new Main();
		main.mainMenu();
	}
	
	public void mainMenu() {
		Main main = new Main();
		
		System.out.println("----------------Employee Management Sytem-------------------");
		System.out.println("ADD EMPLOYEE - TYPE 1");
		System.out.println("EDIT EMPLOYEE BASED ON ID - TYPE 2");
		System.out.println("DELETE EMPLOYEE BASED ON ID - TYPE 3");
		System.out.println("GET EMPLOYEE INFO BASED ON ID - TYPE 4 ");
		System.out.println("GET ALL EMPLOYEE TYPE ");
		System.out.println("YOU WANT TO LOGOUT TYPE 0");
		System.out.println("Enter Input");
		int i = input.nextInt(); 
		main.OperationLogic(i);
		
	}
	
	public void OperationLogic(int i) {
		Main main = new Main();
		
		do {
			if(i == 1) {
				System.out.println("Enter Employee Name");
				String name = input.next();
				System.out.println("Enter Employee Mobile Number");
				String mobile = input.next();
				System.out.println("Enter Employee City");
				String city = input.next();
				emp = new Employee(name, mobile,city);
				empController = new EmployeeController();
				String msg = empController.createEmployee(emp);
				if(msg != null) {
					System.out.println("Employee Succesfully created with ID : " + msg);
				}
				System.out.println("Add Another Employee TYPE 1 otherwise go the Main menu press 5");
				i = input.nextInt();
			}else if(i == 2) {
				System.out.println("Main menu press 5");
				i = input.nextInt();
			}else if(i == 3) {
				//optionGuide(i);
			}else if(i == 4) {
				//optionGuide(i);
			}else if(i == 5 ) {
				main.mainMenu();
			}else {
				System.out.println("Exiting.............");
				System.exit(0);
			}
		}while(i>0);
	}

}
