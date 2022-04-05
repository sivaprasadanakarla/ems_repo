package com.citi.employeee;
import java.util.Date;

import com.citi.employee.model.*;
public class EmployeeBuilder {

	private static final Date Date = null;

	public static void main(String[] args)
	{
		Employee employee1=new Employee();
		employee1.setFirstName("Giri");
		employee1.setLastName("anakarla");
		employee1.setDateOfBirth(28/08/1985);
		employee1.setAdharNumber("425918635680");
		employee1.setAdress("employeeAdress");
		employee1.setContactDetails("employeeContactDetails");
		employee1.setPanCardNumber("APRXY4259");
		employee1.setDateOfJoining(12/10/2018);
		
		
		employee1.setEmployeeId("10001");
		employee1.setFamilyDetails("employeeFamilyDetails");
		
		employee1.setHrManagerId("100201");
		employee1.setHrManagerName("RAM");
		employee1.setPackageDetails(employeePackageDetails);
		
		employee1.setReportingManagerId("10021")
		employee1.setReportingManagerName("RAJ")
		employee1.setSkilldetails("empSkillDetails");

		Adress employeeAdress=new Adress();
		employeeAdress.setAdressLine1("manikonda");
		employeeAdress.setAdressLine1("unguturu");
		employeeAdress.setAdressLine2("gannavaram");
		employeeAdress.setAdressLine3("krishna");
		employeeAdress.setAdressLine4("ap");
		employeeAdress.setCity("vja");
		employeeAdress.setCountry("India");
		employeeAdress.setPinCode("521260");
		employeeAdress.setState("andraPradesh") ; 
		employee1.setAdress(employeeAdress);

		ContactDetails employeeContactDetails=new ContactDetails;
		employeeContactDetails.setEmail()
		employeeContactDetails.setPhone(Phone)

		AccountDetails employeeAccountDetails=new AccountDetails();
		employeeAccountDetails.setReimbursementBankName("cbi");
		employeeAccountDetails.setReimbursementIfscCode("cbin0281028");
		employeeAccountDetails.setSalAccountNumber("100125451121");
		employeeAccountDetails.setSalaryBankName("cbi");
		employeeAccountDetails.setSalaryIfscCode("cbin0281028");
		employee1.setAccountDetails(employeeAccountDetails);

		FamilyDetails employeeFamilyDetails=new FamilyDetails();
		
		employeeFamilyDetails.setChildDetails(ChildDetails[])
		employeeFamilyDetails.setFatherName(String)
		employeeFamilyDetails.setMotherName(String)
		employeeFamilyDetails.setSpouseName(String)
		
		Department employeeDepartment=new Department();
		employeeDepartment.setDepartmentHead("suresh");
		employeeDepartment.setDepartmentId("1001");
		employeeDepartment.setDepartmentName("cse");
		employee1.setDepartment(employeeDepartment);

		EducationalDetails employeeEducationDetails=new EducationalDetails();
		employeeEducationDetails.setHighestdegreeId("1121");
		employeeEducationDetails.setSecondhighestQualification("btech");
		employeeEducationDetails.setSscPassoutyear(2021);
		employeeEducationDetails.setYearOfPassout(2022);
		employeeEducationDetails.setYearOfPassoutSecondHiQual(2022);
		employee1.setEducationalDetails(employeeEducationDetails);
		
		PassportDetails employeePassportDetails=new PassportDetails();
		employeePassportDetails.setDateOfExpiry(22.02.2023);
		employeePassportDetails.setDateOfIssue(10.12.2000);
		employeePassportDetails.setNationality("idian");
		employeePassportDetails.setPassportNumber("122aadd010");
		employeePassportDetails.setPlaceOfIssue("vijayawada");
		employee1.setPassportDetails(employeePassportDetails);
		
		PackageDetails employeePackageDetails=new PackageDetails();
		employeePackageDetails.setBasicSalary(5000);
		employeePackageDetails.setCostToEconomy("200000");
		employeePackageDetails.setHouseRentAllowance(2000);
		employeePackageDetails.setSpecialAllowance(1000);
		
		PreviousComapanyDetails[] previousComapanyDetails=new PreviousComapanyDetails[2];
		previousComapanyDetails [0]=new PreviousComapanyDetails();
		previousComapanyDetails [0].setCompanyName(String)
		previousComapanyDetails [0].setDateOfExit(new Date("20-01-2012"));
		previousComapanyDetails [0].setDateOfJoining(Date)
		previousComapanyDetails [0].setManagerName(String)
		previousComapanyDetails [0].setOffisialMail(String)
		previousComapanyDetails [0].setPositionHeld(String)
		
		
		previousComapanyDetails[1]=new PreviousComapanyDetails();
		previousComapanyDetails [0].setCompanyName(String)
		previousComapanyDetails [0].setDateOfExit(Date)
		previousComapanyDetails [0].setDateOfJoining(Date)
		previousComapanyDetails [0].setManagerName(String)
		previousComapanyDetails [0].setOffisialMail(String)
		previousComapanyDetails [0].setPositionHeld(String)
		
		ProfessionalExp empProfessionalExp=new ProfessionalExp();
		empProfessionalExp.setPreviousComapanyDetails(previousComapanyDetails);
		empProfessionalExp.setTotalExpInYears(10);
		empProfessionalExp.setTotalRelventExpInYears(5);
		employee1.setProfessionalExp(empProfessionalExp);
		
		SkillDetails empSkillDetails=new SkillDetails();
		empSkillDetails.setSkill1("Typing");
		empSkillDetails.setSkill10("talking");
		empSkillDetails.setSkill2("coding");
		empSkillDetails.setSkill3("testing");
		empSkillDetails.setSkill4("writing");
		empSkillDetails.setSkill5("walk");
		empSkillDetails.setSkill6("talk");
		empSkillDetails.setSkill7("code");
		empSkillDetails.setSkill8("test");
		empSkillDetails.setSkill9("write");
		
		



	}

}
