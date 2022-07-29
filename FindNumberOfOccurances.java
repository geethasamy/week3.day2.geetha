package week3.day2.Assignment;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class FindNumberOfOccurances {
	//Assignment2: FindNumbersOccurances

	/*
	 * Input array numbers, each occurances
	 * 
	 * input: {2,3,5,6,3,2,1,4,2,1,6,-1};
	 * output: 2 -> 3 , 3 -> 2, 4 -> 1 
	 * 
	 * Order: Ascending Order
	 * 
	 */
	
	/*
	 * Psuedcode:
	 * 
	 * 1) Create Map -> TreeMap
	 * 2) For loop -> each number -> add to the map
	 * 3) If it is exist -> update it with + 1
	 * 	  Else -> new entry with 1 as value
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int [] value = {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		
		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer,Integer>();
		for (int i = 0; i < value.length; i++)
		{
			treeMap.put(value[i],treeMap.getOrDefault(value[i], 0)+1);
			
			}

		System.out.println(treeMap);
		for (Entry<Integer, Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey()+ "->" +entry.getValue());
			
		}
		
		
		

	}

}
