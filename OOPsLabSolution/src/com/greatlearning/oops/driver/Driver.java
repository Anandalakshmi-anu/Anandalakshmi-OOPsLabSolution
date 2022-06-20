package com.greatlearning.oops.driver;

import java.util.Scanner;

import com.greatlearning.oops.Employee;
import com.greatlearning.oops.service.CredentialService;

public class Driver {

	public static void main(String[] args) {
		String firstName, lastName, department=null;
		int choice;
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter your First Name: ");
		firstName = userInput.next();
		System.out.print("Enter your Last Name: ");
		lastName = userInput.next();
		System.out.println("Please enter the department from the following\n1. Technical\n2. Admin\n3. Human Resource\n4. Legal");
		choice=userInput.nextInt();
		userInput.close();
		switch(choice) {
		case 1:
			department = "tech";
			break;
		case 2:
			department = "admin";
			break;
		case 3:
			department = "hr";
			break;
		case 4:
			department = "legal";
			break;
		default:
			System.out.println("Invalid choice: "+choice+". Please enter from 1 to 4");
		}
		
		Employee employee = new Employee(firstName,lastName,department);
		CredentialService credentialService = new CredentialService();
		credentialService.generateEmailAddress(employee);
		credentialService.generatePassword(employee);
		credentialService.showCredentials(employee);
	}

}
