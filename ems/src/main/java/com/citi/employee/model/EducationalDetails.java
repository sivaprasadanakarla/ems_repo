package com.citi.employee.model;

import java.util.Date;

public class EducationalDetails {
	private String highestdegreeId;
	private int yearOfPassout;
	private String secondhighestQualification;
	private int yearOfPassoutSecondHiQual;
	private int sscPassoutyear;
	public String getHighestdegreeId() {
		return highestdegreeId;
	}
	public void setHighestdegreeId(String highestdegreeId) {
		this.highestdegreeId = highestdegreeId;
	}
	public int getYearOfPassout() {
		return yearOfPassout;
	}
	public void setYearOfPassout(int yearOfPassout) {
		this.yearOfPassout = yearOfPassout;
	}
	public String getSecondhighestQualification() {
		return secondhighestQualification;
	}
	public void setSecondhighestQualification(String secondhighestQualification) {
		this.secondhighestQualification = secondhighestQualification;
	}
	public int getYearOfPassoutSecondHiQual() {
		return yearOfPassoutSecondHiQual;
	}
	public void setYearOfPassoutSecondHiQual(int yearOfPassoutSecondHiQual) {
		this.yearOfPassoutSecondHiQual = yearOfPassoutSecondHiQual;
	}
	public int getSscPassoutyear() {
		return sscPassoutyear;
	}
	public void setSscPassoutyear(int sscPassoutyear) {
		this.sscPassoutyear = sscPassoutyear;
	}

}
