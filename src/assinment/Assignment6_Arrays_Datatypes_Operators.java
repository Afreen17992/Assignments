package assinment;


public class Assignment6_Arrays_Datatypes_Operators {

	public static void main(String[] args) {
		
		/**
	 	Q1. Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
		marks [75, 80, 82] Add 10 marks to each students using assignment operators and
		store it into another array, after adding 10 marks identify the average marks of all
		students
		
		Expected Output:
		Updated Marks:
		Suresh: 85
		Mahesh: 90
		Naresh: 92
		Average Marks: 89.0

	 */		
		
String [] StudentName= {"Suresh","Mahesh","Naresh"};
int [] StudentMarks= {75, 80, 82};

System.out.println("Expected Output : ");
System.out.println(StudentName[0]+" : " + (StudentMarks[0]+10));
System.out.println(StudentName[1]+" : " + (StudentMarks[1]+10));
System.out.println(StudentName[2]+" : " + (StudentMarks[2]+10));
int [] StudentUpdatedMarks= {(StudentMarks[0]+10),(StudentMarks[1]+10),(StudentMarks[2]+10)};

float AverageMarks = ((StudentUpdatedMarks[0]+StudentUpdatedMarks[1]+StudentUpdatedMarks[2])/StudentUpdatedMarks.length); 
System.out.println("Average Marks : " + AverageMarks);
}
}
