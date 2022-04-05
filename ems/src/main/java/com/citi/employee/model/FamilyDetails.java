package com.citi.employee.model;

public class FamilyDetails {
	private String spouseName;
	private ChildDetails[]childDetails;
	private String fatherName;
	private String motherName;
	public String getSpouseName() {
		return spouseName;
	}
	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}
	public ChildDetails[] getChildDetails() {
		return childDetails;
	}
	public void setChildDetails(ChildDetails[] childDetails) {
		this.childDetails = childDetails;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

}
