package com.ems.services;


import java.util.List;
import java.util.Scanner;

import com.ems.dao.EmployeeDAO;
import com.ems.models.Employee;


public class EmployeeServices {
	EmployeeDAO dao = new EmployeeDAO();
	Scanner scan = new Scanner(System.in);
	
	public void registerEmployee() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter employee ID ");
		int id = scan.nextInt();
		System.out.println("Enter employee Name");
		String name = scan.next();
		System.out.println("Enter employee gender ");
		String gender = scan.next();
		System.out.println("Enter employee's Role ");
		String role= scan.next();
		System.out.println("Enter employee salary ");
		double sal = scan.nextDouble();
		System.out.println("Enter employee Department ID ");
		int deptid = scan.nextInt();
		System.out.println("enter the password");
		String pass=scan.next();
		System.out.println("enter the gmailid ");
		String gmail = scan.next();
		//Create an employee object
		Employee emp = new Employee();
		
		//set all details to the employee object
		emp.setDeptId(deptid);
		emp.setEmpId(id);
		emp.setEmpName(name);
		emp.setGender(gender);
		emp.setRole(role);
		emp.setSalary(sal);
		emp.setPass(pass);
		emp.setGmail(gmail);
		
		
		
		
		//send employee object to the registerEmployee() method in the EmployeeDAO class.
		dao.registerEmployee(emp);
	}
	public void displayEmployee(Employee emp) {
		System.out.print(emp.getEmpId()+"\t");
		System.out.print(emp.getEmpName()+"\t");
		System.out.print(emp.getGender()+"\t");
		System.out.print(emp.getRole()+"\t");
		System.out.print(emp.getSalary()+"\t");
		System.out.print(emp.getDeptId()+"\t");
		System.out.println(emp.getPass()+"\t");
		System.out.println(emp.getGmail()+"\t");
		System.out.println();
	}
	
	public void displayEmployees() {
		List<Employee> empList = dao.displayEmployee();
		for(Employee emp : empList) {
			displayEmployee(emp);
		}
	}
	
	
	
	public void menu() {
		while(true) {
			System.out.println("================MENU==================");
			System.out.println("\n1. Register New Employee");
			System.out.println("\n2. Display all Employees");
			System.out.println("\n9. Exit from the program");
			System.out.println("\n\nEnter Your choice");
			int option = scan.nextInt();
			
				switch(option) {
				case 1 : registerEmployee();break;
				case 2 : displayEmployees();break;
			case 9 : System.exit(0);
				default : System.out.println("Sorry!!! you've entered wrong option");
				}
	    	}
	}
}
