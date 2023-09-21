package com.ems.Services;

import java.util.List;
import java.util.Scanner;

import com.ems.dao.customersDAO;
import com.ems.models.customers;

public class EmployeeServices {
	customersDAO dao = new customersDAO();
	Scanner scan = new Scanner(System.in);

	public void registerNewcustomer() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter  Name");
		String name = scan.next();
		System.out.println("Enter phone number ");
		String number = scan.next();
		System.out.println("Enter Gmailid ");
		String gmail = scan.next();
		System.out.println("Enter purpose ");
		String purpose = scan.next();
		System.out.println("Enter city ");
		String city = scan.next();
		// Create an employee object
		customers cust = new customers();

		// set all details to the employee object
		cust.setName(name);
		cust.setPhoneNumber(number);
		cust.setGmail(gmail);
		cust.setPurpose(purpose);
		cust.setCity(city);

		// send employee object to the registerEmployee() method in the EmployeeDAO
		// class.
		dao.registercustomer(cust);
	}

	public void displaycustomer(customers cust) {
		System.out.print(cust.getName() + "\t");
		System.out.print(cust.getPhoneNumber() + "\t");
		System.out.print(cust.getGmail() + "\t");
		System.out.print(cust.getCity() + "\t");
		System.out.print(cust.getPurpose() + "\t");
		System.out.println();
	}

	public void displaycustomer() {
		List<customers> empList = dao.displaycustomer();
		for (customers cust : empList) {
			displaycustomer(cust);
		}
	}

	public void menu() {
		while (true) {
			System.out.println("================MENU==================");
			System.out.println("\n1. Register New customer");
			System.out.println("\n2. Display all customers");
			System.out.println("\n9. Exit from the program");
			System.out.println("\n\nEnter Your choice");
			int option = scan.nextInt();

			switch (option) {
			case 1:
				registerNewcustomer();
				break;
			case 2:
				displaycustomer();
				break;
			case 9:
				System.exit(0);
			default:
				System.out.println("Sorry!!! you've entered wrong option");
			}
		}
	}
}
