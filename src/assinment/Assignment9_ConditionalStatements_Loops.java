package assinment;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Assignment9_ConditionalStatements_Loops {

	public static void main(String[] args) {

//***********Employee Table***********

		// Employee-1 Data
		Map<String, String> Employee1 = new LinkedHashMap<>();
		Employee1.put("Name", "Alice Johnson");
		Employee1.put("Base Salary", "75000.0");
		Employee1.put("Experience (Years)", "5.1");
		Employee1.put("Year-End Rating (Out of 5)", "4.2");

		// Employee-2 Data
		Map<String, String> Employee2 = new LinkedHashMap<>();
		Employee2.put("Name", "Bob Smith");
		Employee2.put("Base Salary", "68000.0");
		Employee2.put("Experience (Years)", "3.2");
		Employee2.put("Year-End Rating (Out of 5)", "3.8");

		// Employee-3 Data
		Map<String, String> Employee3 = new LinkedHashMap<>();
		Employee3.put("Name", "Carol Davis");
		Employee3.put("Base Salary", "82000.0");
		Employee3.put("Experience (Years)", "7.1");
		Employee3.put("Year-End Rating (Out of 5)", "4.5");

		// Employee-4 Data
		Map<String, String> Employee4 = new LinkedHashMap<>();
		Employee4.put("Name", "David Brown");
		Employee4.put("Base Salary", "90000.0");
		Employee4.put("Experience (Years)", "10.2");
		Employee4.put("Year-End Rating (Out of 5)", "2.5");

		// Employee-5 Data
		Map<String, String> Employee5 = new LinkedHashMap<>();
		Employee5.put("Name", "Eva Green");
		Employee5.put("Base Salary", "60000.0");
		Employee5.put("Experience (Years)", "2.4");
		Employee5.put("Year-End Rating (Out of 5)", "3.5");

		List<Map<String, String>> EmployeeList = new LinkedList<>();
		EmployeeList.add(Employee1);
		EmployeeList.add(Employee2);
		EmployeeList.add(Employee3);
		EmployeeList.add(Employee4);
		EmployeeList.add(Employee5);

		for (int i = 0; i < EmployeeList.size(); i++) {
			Map<String, String> Employee = EmployeeList.get(i);
			String Name = Employee.get("Name");
			int VariablePayPercentage = 0, Bonus = 0, Reward = 5000;
			float Hike, HikePercentage;
			float BaseSalary = Float.parseFloat(Employee.get("Base Salary"));
			float Experience = Float.parseFloat(Employee.get("Experience (Years)"));
			float YearEndRating = Float.parseFloat(Employee.get("Year-End Rating (Out of 5)"));

			if (YearEndRating >= 4.0) {
				VariablePayPercentage = 15;
				Bonus = 1500;

			} else if ((YearEndRating >= 3) && (YearEndRating < 4)) {
				VariablePayPercentage = 10;
				Bonus = 1200;

			} else if (YearEndRating < 3.0) {
				VariablePayPercentage = 3;
				Bonus = 300;

			}
			Hike = (BaseSalary * VariablePayPercentage / 100) + Bonus;

			// Employees with Experience >= 5 Years get extra Reward of 5000;
			if (Experience >= 5) {
				Hike += Reward;
				HikePercentage = (Hike / BaseSalary) * 100;
			}
			HikePercentage = (Hike / BaseSalary) * 100;
			System.out.println(Name + " Total Hike Amount : " + Hike);
			System.out.println(Name + " Hike Percentage : " + HikePercentage + "%");

		}
	}

}
