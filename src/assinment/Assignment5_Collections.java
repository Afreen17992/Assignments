package assinment;
import java.util.*;

public class Assignment5_Collections {

public static void main(String[] args) {
/**
 * Inside this Assignment Excel There are 3 TestCases with each Testcase having 3 rows of data.
 * Now, By using collections store all the data into one single variable and from that variable.
 * Print the data  Supplier Name > Office Depot  from Product details table.
 */
	
	
//************* Product Details Table******************
// student-1 Data 	
Map<String, String> student1 = new LinkedHashMap<>();
student1.put("Name", "John Doe");
student1.put("Age", "Twenty");
student1.put("Gender", "Male");
student1.put("Roll Number", "SBA12345");
student1.put("Grade", "A++");
student1.put("Major", "Computer Science");
student1.put("GPA", "3.8");
student1.put("Email", "john@example.com");
student1.put("PAN Number", "SDF6543210");
student1.put("Address", "123 Elm St");
	       
// student-2 Data 
LinkedHashMap<String, String> student2 = new LinkedHashMap<>();
student2.put("Name", "Jane Smith");
student2.put("Age", "Twenty One");
student2.put("Gender", "Female");
student2.put("Roll Number", "SBA12346");
student2.put("Grade", "B+");
student2.put("Major", "Mathematics");
student2.put("GPA", "3.5");
student2.put("Email", "jane@example.com");
student2.put("PAN Number", "REW6543211");
student2.put("Address", "456 Oak St");

//student-3 Data 
LinkedHashMap<String, String> student3 = new LinkedHashMap<>();
student3.put("Name", "Mike Brown");
student3.put("Age", "Twenty Two");
student3.put("Gender", "Male");
student3.put("Roll Number", "SBA12347");
student3.put("Grade", "A+");
student3.put("Major", "Physics");
student3.put("GPA", "3.9");
student3.put("Email", "mike@example.com");
student3.put("PAN Number", "TYR6543212");
student3.put("Address", "789 Pine St");

List<Map<String, String>> studentList = new LinkedList<>();
studentList.add(student1);
studentList.add(student2);
studentList.add(student3);



//************* Employee Details Table******************

//Employee-1 Data 	
Map<String, String> Employee1 = new LinkedHashMap<>();
Employee1.put("Employee ID", "E001");
Employee1.put("Name", "Alice Green");
Employee1.put("Age", "Thirty");
Employee1.put("Gender", "Female");
Employee1.put("Department", "Engineering");
Employee1.put("Position", "Software Engineer");
Employee1.put("Salary", "75K Pounds");
Employee1.put("Email", "alice@example.com");
Employee1.put("PAN Number", "SDF6543210");
								
//Employee-2 Data 
LinkedHashMap<String, String> Employee2 = new LinkedHashMap<>();
Employee2.put("Employee ID", "E002");
Employee2.put("Name", "Bob Johnson");
Employee2.put("Age", "Thirty Five");
Employee2.put("Gender", "Male");
Employee2.put("Department", "Marketing");
Employee2.put("Position", "Marketing Manager");
Employee2.put("Salary", "85K Pounds");
Employee2.put("Email", "bob@example.com");
Employee2.put("PAN Number", "REW6543211");	       

								
//Employee-3 Data 
LinkedHashMap<String, String> Employee3 = new LinkedHashMap<>();
Employee3.put("Employee ID", "E003");
Employee3.put("Name", "Carol White");
Employee3.put("Age", "Twenty Eight");
Employee3.put("Gender", "Female");
Employee3.put("Department", "Sales");
Employee3.put("Position", "Sales Executive");
Employee3.put("Salary", "65K Pounds");
Employee3.put("Email", "carol@example.com");
Employee3.put("PAN Number", "TYR6543212");

List<Map<String, String>> EmployeeList = new LinkedList<>();
EmployeeList.add(Employee1);
EmployeeList.add(Employee2);
EmployeeList.add(Employee3);


//************* Product Details Table******************

//Product-1 Data 	
Map<String, String> Product1 = new LinkedHashMap<>();
Product1.put("Product ID", "P001");
Product1.put("Name", "Laptop");
Product1.put("Category", "Electronics");
Product1.put("Price", "12K Pounds");
Product1.put("Stock Quantity", "Not Available");
Product1.put("Supplier", "Tech Supplies");
Product1.put("Warranty", "2 years");
Product1.put("Rating", "4.5 Stars");
Product1.put("Manufacturing Date", "Aug 2023");
Product1.put("Expiry Date", "Aug 2028");


//Product-2 Data 
Map<String, String> Product2 = new LinkedHashMap<>();
Product2.put("Product ID", "P002");
Product2.put("Name", "Desk Chair");
Product2.put("Category", "Furniture");
Product2.put("Price", "150K Pounds");
Product2.put("Stock Quantity", "Two");
Product2.put("Supplier", "Office Depot");
Product2.put("Warranty", "1 year");
Product2.put("Rating", "4 Stars");
Product2.put("Manufacturing Date", "Sep 2024");
Product2.put("Expiry Date", "N/A");

//Product-3 Data 	
Map<String, String> Product3 = new LinkedHashMap<>();
Product3.put("Product ID", "P003");
Product3.put("Name", "Coffee Maker");
Product3.put("Category", "Kitchen");
Product3.put("Price", "75 Pounds");
Product3.put("Stock Quantity", "Two Hundred");
Product3.put("Supplier", "KitchenWorld");
Product3.put("Warranty", "6 months");
Product3.put("Rating", "4.2 Stars");
Product3.put("Manufacturing Date", "Jan 2025");
Product3.put("Expiry Date", "Jan 2027");
	  
List<Map<String, String>> ProductList = new LinkedList<>();
ProductList.add(Product1);
ProductList.add(Product2);
ProductList.add(Product3);

Map<String, List<Map<String, String>>> AllTableData = new HashMap<>();
AllTableData.put("Products", studentList);
AllTableData.put("Products", EmployeeList);
AllTableData.put("Products", ProductList);

// Print the data  Supplier Name > Office Depot  from Product details table.
System.out.println("Product Supplier Name : "+ AllTableData.get("Products").get(1).get("Supplier"));
}
	}
