package assinment;

public class Assignment3_ArraysAndObject_EmpGroups {
	
	

	public static void main(String[] args) {
		
		Assignment3_ArraysAndObject_Employees Employees = new Assignment3_ArraysAndObject_Employees();
		
		
		String[] EmployeeNames ={Employees.EmpName1,Employees.EmpName2,Employees.EmpName3};
		
		int[] EmployeeIDs= {Employees.EmpId1, Employees.EmpId2, Employees.EmpId3};
		
		// Employee Name: Bharath, Employee ID: 1234
		System.out.println("Employee Name : " + EmployeeNames[0] + ", " + "Employee ID : " + EmployeeIDs[0]);
		System.out.println("Employee Name : " + EmployeeNames[1] + ", " + "Employee ID : " + EmployeeIDs[1]);
		System.out.println("Employee Name : " + EmployeeNames[2] + ", " + "Employee ID : " + EmployeeIDs[2]);
	} 

}
