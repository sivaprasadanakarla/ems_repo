package com.citi.employee.model;

import java.util.Date;

public class Employee {
	private String employeeId;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private Date dateOfJoining;
	private String reportingManagerName;
	private String reportingManagerId;
	private String hrManagerId;
	private String hrManagerName;
	private String adharNumber;
	private String panCardNumber;
	private Adress adress;
	private Department department;
	private ContactDetails contactDetails;
	private AccountDetails accountDetails;
	private SkillDetails skilldetails;
	private PackageDetails packageDetails;
	private PassportDetails passportDetails;
	private FamilyDetails familyDetails;
	private EducationalDetails educationalDetails;
	private ProfessionalExp professionalExp;
	
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date i) {
		this.dateOfBirth = i;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getReportingManagerName() {
		return reportingManagerName;
	}
	public void setReportingManagerName(String reportingManagerName) {
		this.reportingManagerName = reportingManagerName;
	}
	public String getReportingManagerId() {
		return reportingManagerId;
	}
	public void setReportingManagerId(String reportingManagerId) {
		this.reportingManagerId = reportingManagerId;
	}
	public String getHrManagerId() {
		return hrManagerId;
	}
	public void setHrManagerId(String hrManagerId) {
		this.hrManagerId = hrManagerId;
	}
	public String getHrManagerName() {
		return hrManagerName;
	}
	public void setHrManagerName(String hrManagerName) {
		this.hrManagerName = hrManagerName;
	}
	public String getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}
	public String getPanCardNumber() {
		return panCardNumber;
	}
	public void setPanCardNumber(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public ContactDetails getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}
	public AccountDetails getAccountDetails() {
		return accountDetails;
	}
	public void setAccountDetails(AccountDetails accountDetails) {
		this.accountDetails = accountDetails;
	}
	public SkillDetails getSkilldetails() {
		return skilldetails;
	}
	public void setSkilldetails(SkillDetails skilldetails) {
		this.skilldetails = skilldetails;
	}
	public PackageDetails getPackageDetails() {
		return packageDetails;
	}
	public void setPackageDetails(PackageDetails packageDetails) {
		this.packageDetails = packageDetails;
	}
	public PassportDetails getPassportDetails() {
		return passportDetails;
	}
	public void setPassportDetails(PassportDetails passportDetails) {
		this.passportDetails = passportDetails;
	}
	public FamilyDetails getFamilyDetails() {
		return familyDetails;
	}
	public void setFamilyDetails(FamilyDetails familyDetails) {
		this.familyDetails = familyDetails;
	}
	public EducationalDetails getEducationalDetails() {
		return educationalDetails;
	}
	public void setEducationalDetails(EducationalDetails educationalDetails) {
		this.educationalDetails = educationalDetails;
	}
	public ProfessionalExp getProfessionalExp() {
		return professionalExp;
	}
	public void setProfessionalExp(ProfessionalExp professionalExp) {
		this.professionalExp = professionalExp;
	}
	
	
	

}
