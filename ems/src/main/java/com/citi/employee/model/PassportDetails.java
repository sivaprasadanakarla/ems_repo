package com.citi.employee.model;

import java.util.Date;

public class PassportDetails
{
private String passportNumber;
private String placeOfIssue;
private Date dateOfIssue;
private Date dateOfExpiry;
private String nationality;
public String getPassportNumber() {
	return passportNumber;
}
public void setPassportNumber(String passportNumber) {
	this.passportNumber = passportNumber;
}
public String getPlaceOfIssue() {
	return placeOfIssue;
}
public void setPlaceOfIssue(String placeOfIssue) {
	this.placeOfIssue = placeOfIssue;
}
public Date getDateOfIssue() {
	return dateOfIssue;
}
public void setDateOfIssue(Date dateOfIssue) {
	this.dateOfIssue = dateOfIssue;
}
public Date getDateOfExpiry() {
	return dateOfExpiry;
}
public void setDateOfExpiry(Date dateOfExpiry) {
	this.dateOfExpiry = dateOfExpiry;
}
public String getNationality() {
	return nationality;
}
public void setNationality(String nationality) {
	this.nationality = nationality;
}
public void setDateOfExpiry(double d) {
	// TODO Auto-generated method stub
	
}

}
