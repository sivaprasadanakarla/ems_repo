package com.citi.employee;
import com.citi.employee.dummyemp.EmployeeGiri;
import com.citi.employee.dummyemp.EmployeeKrishna;
import com.citi.employee.dummyemp.EmployeeMahesh;
import com.citi.employee.dummyemp.EmployeeRam;
import com.citi.employee.dummyemp.EmployeeRamesh;
import com.citi.employee.dummyemp.EmployeeSam;
import com.citi.employee.dummyemp.EmployeeSiva;
import com.citi.employee.dummyemp.EmployeeSuresh;
import com.citi.employee.model.Employee;
public class EmployeeBuilder {

	public static void main(String[] args)
	{

		Employee[] employees = new Employee[8];
		employees[0] = EmployeeGiri.getDummyEmployees();
		employees[1] = EmployeeKrishna.getDummyEmployees();
		employees[2] = EmployeeMahesh.getDummyEmployees();
		employees[3] = EmployeeRamesh.getDummyEmployees();
		employees[4] = EmployeeRam.getDummyEmployees();
		employees[5] = EmployeeSam.getDummyEmployees();
		employees[6] = EmployeeSiva.getDummyEmployees();
		employees[7] = EmployeeSuresh.getDummyEmployees();
		getHighestPaidEmployee(employees);

	}
	//find hightst paid employee from all employees
	public static String getHighestPaidEmployee(Employee[] employees) {
		int[] allSalaries = new int[8];
		String[] allNames = new String[8];
		for(int i=0; i<employees.length; i++) {
			allSalaries[i] = employees[i].getPackageDetails().getCostToCompany();
			allNames[i] = employees[i].getFirstName();
			
		}	
		 int max = allSalaries[0];
	      String name=null;  
         // Traverse array elements from second and
         // compare every element with current max  
         for (int j = 1; j < allSalaries.length; j++)
         {
             if (allSalaries[j] > max) {
                 max = allSalaries[j];
                 name=allNames[j];
                 }
         }
		System.out.println(max);
		System.out.println(name);
				return null;
		
	}
}

