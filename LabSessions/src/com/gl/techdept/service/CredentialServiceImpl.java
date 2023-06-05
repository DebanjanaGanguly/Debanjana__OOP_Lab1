package com.gl.techdept.service;

import java.util.Random;

import com.gl.techdept.model.Employee;

public class CredentialServiceImpl implements CredentialService{

	public String generateEmailAddress(Employee emp, String dept) {
		return emp.getFirstName().toLowerCase()+ emp.getLastName().toLowerCase()+"@" + dept + ".gl.com";
	}

	public String generatePassword() {
		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String specialChars="!@#$%^&*()><?";
		
		String values= capitalLetters + smallLetters + numbers + specialChars;
		Random r= new Random();
		
		String password="";
		for(int i=0; i<8; i++)
			password+= values.charAt(r.nextInt(values.length()));
		return password;
	}

	public void showCredentials(Employee employeeCred, String dept) {
	System.out.println("Dear " +employeeCred.getFirstName() + " your generated credentials are as follows: ");
	System.out.println("Email --->" +generateEmailAddress(employeeCred, dept));
	System.out.println("Password --->" +generatePassword());
		}
}
