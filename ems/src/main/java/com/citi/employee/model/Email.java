package com.citi.employee.model;

public class Email {
private String personalEmail;
private String officeEmail;
private String secondaryPersonalEmail;
public String getPersonalEmail() {
	return personalEmail;
}
public void setPersonalEmail(String personalEmail) {
	this.personalEmail = personalEmail;
}
public String getOfficeEmail() {
	return officeEmail;
}
public void setOfficeEmail(String officeEmail) {
	this.officeEmail = officeEmail;
}
public String getSecondaryPersonalEmail() {
	return secondaryPersonalEmail;
}
public void setSecondaryPersonalEmail(String secondaryPersonalEmail) {
	this.secondaryPersonalEmail = secondaryPersonalEmail;
}
}