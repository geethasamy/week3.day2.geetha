package week3.day2.Assignment;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;


public class MissingNumber {
	/*
	 * Problem 
	 * 
	 * There will be running number between 1 to 10
	 * One of the unique number will be missing
	 * Find the missing number
	 * 
	 * 
	 */
	
	/*
	 * Psuedocode
	 * 
	 * a) Remove the duplicates using Set
	 * b) Make sure the set is in the ascending order
	 * c) Iterate from the starting number and verify the next number is + 1
	 * d) If did not match, that is the number
	 * 
	 */
	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,1,2,4,7,8,9,10};
		TreeSet<Integer> TS = new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) 
		{
			TS.add(data[i]);
		}
		List<Integer> convList = new ArrayList<Integer>(TS);
		for (int i = 0; i <= TS.size(); i++) 
		{
			if(convList.contains(convList.get(i)+1))
				{
				System.out.println(convList.get(i)+1);
				}
			else 
			{
				if(i+1 <TS.size()) {
					convList.add(convList.get(i)+1);
				}
				
			}
		}
		
		TreeSet<Integer> TS1 = new TreeSet<Integer>(convList);

		System.out.println("Finding the missing number : " +TS1);
	}

}
