package assinment;

public class Assignment2_Array {

	public static void main(String[] args) {

		// Semester-1
		String[] Sem_1 = {"Mathematics-I","Physics","Chemistry","Computer Programming", "Engineering Drawing" ,"Basic Electrical Eng."};
		
		// Semester-2
		String[] Sem_2 = {"Mathematics II","Mechanics","Environmental Sci.","Basic Electronics","Engineering Physics","Engineering Graphics"};
		
		// Semester-3
		String[] Sem_3 = {"Data Structures","Discrete Mathematics","Digital Electronics","Operating Systems","Signals and Systems","Signals and Systems"};
		
		// Semester-4
		String[] Sem_4 = {"Algorithms","Computer Networks","Database Systems","Microprocessors","Communication Eng.","Software Engineering"};
		
		// Semester-5
		String[] Sem_5 = {"Probability & Stats","Machine Learning","Compiler Design","Theory of Computation","Embedded Systems","Computer Graphics"};
		
		
		// Semester-1 Marks
		String[] Sem1_Marks = {"Pass(85)","Fail(21)","Pass(74)","Pass(88)","Pass(79)"};
		
		// Semester-2 Marks
		String[] Sem2_Marks = {"Pass(82)","Pass(77)","Pass(93)","Fail(19)","Fail(24)","Pass(90)"};
		
		// Semester-3 Marks
		String[] Sem3_Marks = {"Pass(88)","Pass(81)","Pass(76)","Fail(32)","Pass(85)","Pass(78)"};
		
		// Semester-4 Marks
		String[] Sem4_Marks = {"Pass(91)","Pass(73)","Fail(19)","Pass(80)"," Pass(76)","Pass(87)"};
		
		// Semester-5 Marks
		String[] Sem5_Marks = {"Pass(86)","Pass(88)","Pass(84)","Pass(95)"," Pass(73)","Pass(90)"};
		

		// 2D
		// AllSemester
		String[][] AllSemesterSubjects = {Sem_1,Sem_2,Sem_3,Sem_4,Sem_5};
		// Semester-1 Marks
		String[][] AllSemesterMarks = {Sem1_Marks,Sem2_Marks,Sem3_Marks,Sem4_Marks,Sem5_Marks};
		
		// Print Semester 2 Subject 4 and Subject 5 names using 2D Array
		System.out.println("1. Semester 2 Subject 4 and Subject 5 names(using 2D Array) : " + AllSemesterSubjects[1][3] + " & " +AllSemesterSubjects[1][4]);
		
		// Print the Status/Marks of Semester 4 Subject 3 and Subject 6 using 2D Array
		System.out.println("2. Marks of Semester 4 Subject 3 and Subject 6(using 2D Array) : " + AllSemesterMarks[3][2] + " & " +AllSemesterMarks[3][5]);

		System.out.println();
		System.out.println();
		// 3D
		String[][][] AllSemesterSubjectsAndAllSemesterMarks = {AllSemesterSubjects,AllSemesterMarks};
		// Print Semester 2 Subject 4 and Subject 5 names using 3D Array
		System.out.println("1. Semester 2 Subject 4 and Subject 5 names(using 3D Array) : " + AllSemesterSubjectsAndAllSemesterMarks[0][1][3] + " & "+ AllSemesterSubjectsAndAllSemesterMarks[0][1][4]);
		// Print the Status/Marks of Semester 4 Subject 3 and Subject 6 using 3D Array
		System.out.println("2. Marks of Semester 4 Subject 3 and Subject 6(using 3D Array) : " + AllSemesterSubjectsAndAllSemesterMarks[1][3][2] + " & "+ AllSemesterSubjectsAndAllSemesterMarks[1][3][5]);
	}	    
		}