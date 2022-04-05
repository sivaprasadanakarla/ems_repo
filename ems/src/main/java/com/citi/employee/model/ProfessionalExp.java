package com.citi.employee.model;

public class ProfessionalExp {
	private int totalExpInYears;
	private int totalRelventExpInYears;
	private PreviousComapanyDetails[] previousComapanyDetails;
	public int getTotalExpInYears() {
		return totalExpInYears;
	}
	public void setTotalExpInYears(int totalExpInYears) {
		this.totalExpInYears = totalExpInYears;
	}
	public int getTotalRelventExpInYears() {
		return totalRelventExpInYears;
	}
	public void setTotalRelventExpInYears(int totalRelventExpInYears) {
		this.totalRelventExpInYears = totalRelventExpInYears;
	}
	public PreviousComapanyDetails[] getPreviousComapanyDetails() {
		return previousComapanyDetails;
	}
	public void setPreviousComapanyDetails(PreviousComapanyDetails[] previousComapanyDetails) {
		this.previousComapanyDetails = previousComapanyDetails;
	}

}
