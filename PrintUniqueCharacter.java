package week3.day2.Assignment;

import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueCharacter {

	//PrintUniqueCharacter
		/*
		 * Problem
		 * 
		 * a) Take your name as input
		 * b) Print all unique characters only (any order)
		 * 
		 * Input:  babu
		 * Output: a u 
		 * 
		 */

		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
	
	public static void main(String[] args) {
		String str = "Geetha";
		char[] chararray = str.toCharArray();
		Set<Character> TS = new TreeSet<Character>();
		for (int i = 0; i < chararray.length; i++) {
			TS.add(chararray[i]);
		}
		System.out.println(TS);

	}

}
