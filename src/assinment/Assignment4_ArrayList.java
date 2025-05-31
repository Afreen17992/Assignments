package assinment;

import java.util.ArrayList;
import java.util.List;

public class Assignment4_ArrayList {
	
	public static void main(String[] args) {
		
	/**
	1. Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th	cities combined.
	
		Delhi	1,397.30
		Bangalore 741
		Visakhapatnam 681.96
		Hyderabad 650
		Lucknow	631
	*/
	System.out.println("Q1. Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th	cities combined.");
	System.out.println();
	
	
	
		List<String> LargestCityNames = new ArrayList<String>();
	
		LargestCityNames.add("Delhi");
		LargestCityNames.add("Bangalore");
		LargestCityNames.add("Visakhapatnam");
		LargestCityNames.add("Hyderabad");
		LargestCityNames.add("Lucknow");
		
		List<Float> LargestCityAreas = new ArrayList<Float>();
		LargestCityAreas.add(1397.30f);
		LargestCityAreas.add(741.0f);
		LargestCityAreas.add(681.96f);
		LargestCityAreas.add(650.0f);
		LargestCityAreas.add(631.0f);
		
		System.out.println("1. "+LargestCityNames.get(0)+" - " + LargestCityAreas.get(0)+"km²");
		System.out.println("2. "+LargestCityNames.get(1)+" - " + LargestCityAreas.get(1)+"km²");
		System.out.println("3. "+LargestCityNames.get(2)+" - " + LargestCityAreas.get(2)+"km²");
		System.out.println("4. "+LargestCityNames.get(3)+" - " + LargestCityAreas.get(3)+"km²");
		System.out.println("5. "+LargestCityNames.get(4)+" - " + LargestCityAreas.get(4)+"km²");
		System.out.println();
		// Total area of the 3rd and 4th cities
		Float Totalarea = LargestCityAreas.get(2)+LargestCityAreas.get(3);
		System.out.println("Total area of the 3rd and 4th cities : " + Totalarea+"km²");
		System.out.println();
/**
Q2.Create a set of the top 10 most visited tourist attractions in the world and print out all
of them and its size.
1.The Taj Mahal
2.The Eiffel Tower
3.Colosseum
4.The Louvre
5.Empire State Building
6.Buckingham Palace
7.Sagrada Familia
8.Machu Picchu
9.Great Wall of China
10.Sydney Opera House
		
*/
		
		System.out.println("Q2.Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size");
		System.out.println();
				
			List<String> Touristplaces = new ArrayList<String>();
		
			Touristplaces.add("The Taj Mahal");
			Touristplaces.add("The Eiffel Tower");
			Touristplaces.add("Colosseum");
			Touristplaces.add("The Louvre");
			Touristplaces.add("Empire State Building");
			Touristplaces.add("Buckingham Palace");
			Touristplaces.add("Sagrada Familia");
			Touristplaces.add("Machu Picchu");
			Touristplaces.add("Great Wall of China");
			Touristplaces.add("Sydney Opera House");
			
			System.out.println("1. "+Touristplaces.get(0));
			System.out.println("2. "+Touristplaces.get(1));
			System.out.println("3. "+Touristplaces.get(2));
			System.out.println("4. "+Touristplaces.get(3));
			System.out.println("5. "+Touristplaces.get(4));
			System.out.println("6. "+Touristplaces.get(5));
			System.out.println("7. "+Touristplaces.get(6));
			System.out.println("8. "+Touristplaces.get(7));
			System.out.println("9. "+Touristplaces.get(8));
			System.out.println("10. "+Touristplaces.get(9));
			System.out.println();
			// Total Size
			int TotalSize = Touristplaces.size();
			System.out.println("Total Size : " + TotalSize);
			System.out.println();
			
/**			
Q3:Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and	6th Value.
Numbers: [10, 74, 68, 65, 93, 33, 54, 98, 65, 33]
*/	
			
	System.out.println("Q3:Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value");
	System.out.println();
	
	List<Integer> Numbers = new ArrayList<Integer>();
	Numbers.add(10);
	Numbers.add(74);
	Numbers.add(68);
	Numbers.add(65);
	Numbers.add(93);
	Numbers.add(33);
	Numbers.add(54);
	Numbers.add(98);
	Numbers.add(65);
	Numbers.add(33);

	// Printing 10 Numbers
	System.out.println("Numbers: " + Numbers);
	
	// print out the Average of 5th and	6th Value.
	System.out.println("5th Number : " + Numbers.get(4));   
	System.out.println("6th Number : " + Numbers.get(5)); 
	
	int Average =(Numbers.get(4)+Numbers.get(5))/2;
	System.out.println("Average of 5th and 6th Value :" + Average);
	System.out.println();
	
/**
 * Q4. Create a list of the top 5 highest-grossing movies of all time and print out the third
	movie on the list.	
 *	Highest-grossing movies Names : [2.0, Darbar, Leo, Ponniyin Selvan, Baahubali] 
 
 */
	
	
	System.out.println("Q4. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list");
	System.out.println();
	
List<String> MovieNames = new ArrayList<String>();
MovieNames.add("2.0");
MovieNames.add("Darbar");
MovieNames.add("Leo");
MovieNames.add("Ponniyin Selvan");
MovieNames.add("Baahubali");
System.out.println("Highest-grossing movies Names : " +MovieNames);
// print out the third movie on the list
System.out.println("Third movie on the list : "+ MovieNames.get(2));



	
	}
}
