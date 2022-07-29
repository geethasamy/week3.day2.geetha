package week3.day2.Assignment;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateNumbers {
	/*
	 * int[] data = {4,3,6,8,29,1,2,4,7,8};

		/*
		 * Problem Statement : Print only duplicate values
		 * Expected output: 4 and 8
		 * 
		 * How to solve?
		 * 1) Regular for loop
		 * 2) Using Set
		 * 
		 * Using Set 
		 * 
		 * a) Add every element into Set
		 * b) If it is already there in the Set -> Print duplicate
		 * 
		 */

	 

	public static void main(String[] args) {
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		
		Set<Integer> setval = new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			if(setval.contains(data[i]))
			{
				System.out.println(data[i] + " is Duplicate value");
			}
			else
			{
			setval.add(data[i]);
			}
		}

	}

}
