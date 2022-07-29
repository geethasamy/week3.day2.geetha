package week3.day2.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class FindSecondLargest {

	/*
	 * // Here is the input
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		//       output= 7;

		*
		 * Pseudo Code: 
		 * a) Create a empty Set Using TreeSet
		 * b) Declare for loop iterator from 0 to data.length and add into Set 
		 * c) converted Set into List
		 * d) Print the second last element from List
		 * 
		 * 
		 */
	 
	
	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		TreeSet<Integer> TS = new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++)
		{
			TS.add(data[i]);
			
		}
		List<Integer> conList = new ArrayList<Integer>(TS);
		System.out.println("Second Largest number from list : " +conList.get(conList.size()-2));

	}

}
