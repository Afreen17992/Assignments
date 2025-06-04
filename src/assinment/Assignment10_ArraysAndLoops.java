package assinment;

public class Assignment10_ArraysAndLoops {

	/**
		Given values are 12 ,34,11,36,87,98,93.
		Store the values in Array and Print second and third largest number from the above values without
		using collections and default sort methods
	 
	 */
	public static void main(String[] args) {
		int[] SortedValues =new int[7];
		  int[] GivenValues = {12, 34, 11, 36, 87, 98, 93};
		  
		  
		  for (int i = 0; i < GivenValues.length; i++) {
			    for (int j = i+1; j < GivenValues.length; j++) {
			        if (GivenValues[i] < GivenValues[j]) {
			            int a = GivenValues[i];
			            GivenValues[i] = GivenValues[j];
			            GivenValues[j] = a;
			        }
			    }
			}
			
	        for (int i = 0; i < GivenValues.length; i++) {
	            SortedValues[i] = GivenValues[i];
	        }
	        // Print sorted array
	        System.out.print("Sorted Array : ");
	        for (int i = 0; i < SortedValues.length; i++) {
	            System.out.print(SortedValues[i]+" ");
	        }

	        System.out.println();
	        // Print second and third largest
	        System.out.println("Second Largest Number in the Given Values : " + SortedValues[1]);
	        System.out.println("Third Largest Number in the Given Values : " +  SortedValues[2]);
	    }
	}
