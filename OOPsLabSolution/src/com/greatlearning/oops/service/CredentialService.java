package com.greatlearning.oops.service;

import java.util.Random;

import com.greatlearning.oops.Employee;

public class CredentialService {
	
	public String generateEmailAddress(Employee emp) {
		String emailId = emp.getFirstName()+emp.getLastName()+"@"+emp.getDepartment()+".edutech.com";
		emp.setEmailId(emailId);
		return emailId;
	}
	
	public char[] generatePassword(Employee emp) {
		int length = 8;
		String numbers = "0123456789";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String specialCharacters = "!@#$*";
		String mixedPattern = numbers + smallLetters + capitalLetters + specialCharacters;
		Random random = new Random();
	    char[] password = new char[length];
	    
	    password[0] = smallLetters.charAt(random.nextInt(smallLetters.length()));
	    password[1] = numbers.charAt(random.nextInt(numbers.length()));
	    password[2] = capitalLetters.charAt(random.nextInt(capitalLetters.length()));
	    password[3] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	    for(int i = 4; i< length ; i++) {
	       password[i] = mixedPattern.charAt(random.nextInt(mixedPattern.length()));
	    }
		
		emp.setPassword(password);
		return password;		
	}
	
	public void showCredentials(Employee emp) {
		System.out.println("Dear "+emp.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email ---> "+emp.getEmailId());
		System.out.println("Password ---> "+String.valueOf(emp.getPassword()));
	}

}
