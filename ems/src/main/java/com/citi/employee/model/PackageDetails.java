package com.citi.employee.model;

public class PackageDetails {
	private int costToCompany;
	private int basicSalary;
	private int houseRentAllowance;
	private int specialAllowance;

	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	public int getHouseRentAllowance() {
		return houseRentAllowance;
	}
	public int getCostToCompany() {
		return costToCompany;
	}
	public void setCostToCompany(int costToCompany) {
		this.costToCompany = costToCompany;
	}
	public void setHouseRentAllowance(int houseRentAllowance) {
		this.houseRentAllowance = houseRentAllowance;
	}
	public int getSpecialAllowance() {
		return specialAllowance;
	}
	public void setSpecialAllowance(int specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

}
