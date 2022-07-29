package week3.day2.Assignment;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindMostDuplicateNumber {
	/*
	 * Assignment3:Find the most duplicate number -> First most duplicate
 * input: abbaba
	 * output: b
	 * 
	 * 
	 */
	
	/*
	 * Psuedocode
	 * 
	 * 1) Map -> HashMap 
	 * 2) String -> ch[] -> Get all the character -> occurance
	 * 3) Keep comparing the occurance with other values -> max value -> character
	 * 
	 */
	 

	public static void main(String[] args) {
		 
		int maxoccurence=0;
		 String str = "abbabab";
		 
		 char[] strarr = str.toCharArray();
		 char maxchar = '0';
		 HashMap<Character,Integer> hashmap = new HashMap<Character,Integer>();
		for (int i = 0; i < strarr.length; i++) {
			hashmap.put(strarr[i],hashmap.getOrDefault(strarr[i], 0)+1);
			
		}
		System.out.println(hashmap);
//		for (Entry<Character,Integer> entry : hashmap.entrySet()) {
//			if(entry.getValue().m)
//			{
//			System.out.println(entry.getKey()+ "->" +entry.getValue());
//			}
		
		for (Entry<Character, Integer> entry : hashmap.entrySet()) {
			if(entry.getValue()>maxoccurence) {
				maxoccurence=entry.getValue();
				maxchar=entry.getKey();
			}
		}
		System.out.println("The most duplicate character in the string is "+maxchar+" having the most occurence of "+maxoccurence);
		}
			
			
		
		 
	}


