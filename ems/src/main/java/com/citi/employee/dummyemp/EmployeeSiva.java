package com.citi.employee.dummyemp;

import java.util.Date;

import com.citi.employee.model.AccountDetails;
import com.citi.employee.model.Adress;
import com.citi.employee.model.ChildDetails;
import com.citi.employee.model.ContactDetails;
import com.citi.employee.model.Department;
import com.citi.employee.model.EducationalDetails;
import com.citi.employee.model.Email;
import com.citi.employee.model.Employee;
import com.citi.employee.model.FamilyDetails;
import com.citi.employee.model.PackageDetails;
import com.citi.employee.model.PassportDetails;
import com.citi.employee.model.Phone;
import com.citi.employee.model.PreviousComapanyDetails;
import com.citi.employee.model.ProfessionalExp;
import com.citi.employee.model.SkillDetails;

public class EmployeeSiva {
	public static Employee getDummyEmployees() 
	{
		Employee employee1=new Employee();
		employee1.setFirstName("siva");
		employee1.setLastName("anakarla");
		employee1.setDateOfBirth(new Date(1985,1,12));
		employee1.setAdharNumber("425918605680");
		employee1.setPanCardNumber("APRXY4259");
		employee1.setDateOfJoining(new Date(1985,1,12));
		employee1.setEmployeeId("10001");
		employee1.setHrManagerId("100201");
		employee1.setHrManagerName("sAM");
		employee1.setReportingManagerId("10021");
		employee1.setReportingManagerName("RAJ");
		

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

		
		AccountDetails employeeAccountDetails=new AccountDetails();
		employeeAccountDetails.setReimbursementBankName("cbi");
		employeeAccountDetails.setReimbursementIfscCode("cbin0281028");
		employeeAccountDetails.setSalAccountNumber("100125451121");
		employeeAccountDetails.setSalaryBankName("cbi");
		employeeAccountDetails.setSalaryIfscCode("cbin0281028");
		employee1.setAccountDetails(employeeAccountDetails);

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
		employeePassportDetails.setDateOfExpiry(new Date(1985,1,12));
		employeePassportDetails.setDateOfIssue(new Date(1985,1,12));
		employeePassportDetails.setNationality("idian");
		employeePassportDetails.setPassportNumber("122aadd010");
		employeePassportDetails.setPlaceOfIssue("vijayawada");
		employee1.setPassportDetails(employeePassportDetails);

		PackageDetails employeePackageDetails=new PackageDetails();
		employeePackageDetails.setBasicSalary(52000);
		employeePackageDetails.setCostToCompany(23000);
		employeePackageDetails.setHouseRentAllowance(2000);
		employeePackageDetails.setSpecialAllowance(1000);
		employee1.setPackageDetails(employeePackageDetails);

		PreviousComapanyDetails[] previousComapanyDetails=new PreviousComapanyDetails[2];
		previousComapanyDetails [0]=new PreviousComapanyDetails();
		previousComapanyDetails [0].setCompanyName("softech");
		previousComapanyDetails [0].setDateOfExit(new Date(1985,1,12));
		previousComapanyDetails [0].setDateOfJoining(new Date(1985,1,12));
		previousComapanyDetails [0].setManagerName("ramji");
		previousComapanyDetails [0].setOffisialMail("seshgaijjss@gail.com");
		previousComapanyDetails [0].setPositionHeld("team Leader");


		previousComapanyDetails[1]=new PreviousComapanyDetails();
		previousComapanyDetails [0].setCompanyName("infotech");
		previousComapanyDetails [0].setDateOfExit(new Date(1985,1,12));
		previousComapanyDetails [0].setDateOfJoining(new Date(1985,1,12));
		previousComapanyDetails [0].setManagerName("mahesh");
		previousComapanyDetails [0].setOffisialMail("mahesh@gmail.com");
		previousComapanyDetails [0].setPositionHeld("TeamaManager");

		ProfessionalExp empProfessionalExp=new ProfessionalExp();
		empProfessionalExp.setPreviousComapanyDetails(previousComapanyDetails);
		empProfessionalExp.setTotalExpInYears(10);
		empProfessionalExp.setTotalRelventExpInYears(5);
		employee1.setProfessionalExp(empProfessionalExp);

		SkillDetails empSkillDetails=new SkillDetails();
		empSkillDetails.setSkill1("Typing");
		empSkillDetails.setSkill2("coding");
		empSkillDetails.setSkill3("testing");
		empSkillDetails.setSkill4("writing");
		empSkillDetails.setSkill5("walk");
		empSkillDetails.setSkill6("talk");
		empSkillDetails.setSkill7("code");
		empSkillDetails.setSkill8("test");
		empSkillDetails.setSkill9("write");
		employee1.setSkilldetails(empSkillDetails);

		Phone empPhone=new Phone();
		empPhone.setLandLineNumber("08652521111");
		empPhone.setMobileNumber("08652521155");
		empPhone.setMobileNumber("086525211333");
		empPhone.setOfficeNumber("086525211999");
		empPhone.setSecondaryMobile("08652521555");


		Email empEmail=new Email();
		empEmail.setOfficeEmail("sehsah@gmail.com");
		empEmail.setPersonalEmail("kehsah@gmail.com");
		empEmail.setSecondaryPersonalEmail("mehsah@gmail.com");

		ContactDetails contactDetails=new ContactDetails();
		contactDetails.setEmail(empEmail);
		contactDetails.setPhone(empPhone);
		employee1.setContactDetails(contactDetails);


		

		ChildDetails[] childDetails=new ChildDetails[2];
		
		childDetails[0]=new ChildDetails();
		childDetails[0].setChaildGender("male");
		childDetails[0].setChildAge(4);
		childDetails[0].setChildName("Hethvik");

		childDetails[1]=new ChildDetails();
		childDetails[1].setChaildGender("female");
		childDetails[1].setChildAge(3);
		childDetails[1].setChildName("Bhoomi");
		
		FamilyDetails familyDatails=new FamilyDetails();
		familyDatails.setChildDetails(childDetails);
		familyDatails.setFatherName("krishna");
		familyDatails.setMotherName("Ramana");
		familyDatails.setSpouseName("Bhavani");
		
		employee1.setFamilyDetails(familyDatails);
		return employee1;
	}

}
