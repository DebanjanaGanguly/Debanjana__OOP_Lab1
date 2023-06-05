package com.gl.techdept.main;

import java.util.Scanner;

import com.gl.techdept.model.Employee;
import com.gl.techdept.service.CredentialService;
import com.gl.techdept.service.CredentialServiceImpl;

public class DriverApp {

	public static void main(String[] args) {
		CredentialService c = new CredentialServiceImpl();
		Scanner sc =new Scanner(System.in);
	//display
		System.out.println("Enter your First Name");
		String fn= sc.next();
		System.out.println("Enter your Last Name");
		String ln= sc.next();
		Employee e = new Employee(fn, ln);
		System.out.println("Please enter the department from the following list:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		String dept = null;
		int choice = sc.nextInt();

		switch(choice) {
		case 1: 
			dept="tech"; 
			break;
		case 2: 
			dept="admin"; 
			break;
		case 3: 
			dept="hr"; 
			break;
		case 4: 
			dept="legal"; 
			break;
		default: 
			System.out.println("Please enter valid option");
		}

		if (dept!= null) {
			c.generatePassword();
			c.generateEmailAddress(e, dept);
			c.showCredentials(e, dept);
		}
		sc.close();
	}
}
