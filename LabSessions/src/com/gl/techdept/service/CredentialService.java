package com.gl.techdept.service;

import com.gl.techdept.model.Employee;

public interface CredentialService {
public String generateEmailAddress(Employee emp, String dept);
public String generatePassword();
public void showCredentials(Employee employeeCred, String dept);
}
