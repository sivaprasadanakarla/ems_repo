package com.citi.employee.model;

import java.util.Date;

public class PreviousComapanyDetails {
private String companyName;
private Date dateOfJoining;
private Date dateOfExit;
private String positionHeld;
private String managerName;
private String offisialMail;
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public Date getDateOfJoining() {
	return dateOfJoining;
}
public void setDateOfJoining(Date dateOfJoining) {
	this.dateOfJoining = dateOfJoining;
}
public Date getDateOfExit() {
	return dateOfExit;
}
public void setDateOfExit(Date dateOfExit) {
	this.dateOfExit = dateOfExit;
}
public String getPositionHeld() {
	return positionHeld;
}
public void setPositionHeld(String positionHeld) {
	this.positionHeld = positionHeld;
}
public String getManagerName() {
	return managerName;
}
public void setManagerName(String managerName) {
	this.managerName = managerName;
}
public String getOffisialMail() {
	return offisialMail;
}
public void setOffisialMail(String offisialMail) {
	this.offisialMail = offisialMail;
}

}
