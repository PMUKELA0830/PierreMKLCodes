package stringManip;

import java.util.Arrays;

public class StringManip1 {
	
	
	private String stringInputModified;
	
	/*Write a method to replace all spaces in a string with '%20'. 
	 * You may assume that the string has sufficient space at the end 
	 * to hold the additional characters. and that you are given the "true" 
	 * length of the string.
	 * 
	 * Example : "Mr. John Smith       ";RESULT: "Mr.%20John%20Smith%20"
	 */
	
	
	/*Algorithm 
	 * 
	 * [1] write a method to split the string input at the white space
	 * 
	 * [2] use the concept of substrings and concatenation to connect 
	 * 	   these substrings after splitting and insert the two characters
	 * 	   %20 in between
	 * 
	 * 
	 * Follow these examples
	 * 
	 * 
	 */
	
	
	//This method will implement a solution for the above problem
	
	public int countWhiteSpace(String stringInput) {
		int count = 0;
		
		int finalCount = 0;
		char [] charInput = stringInput.toCharArray();
		for (int j = 0; j < charInput.length; j++) {
			if (charInput[j] == ' ') {
				count += count;
				
				finalCount = 2*count;
			}
		}
		
		return count;
		
	}
	
	public String splitStringAddCharr(String stringInput) {
		String[] tempStringInput = stringInput.split(" "); //After splitting the string input
		                                                   // we get an array of size subtract all
		                                                   // white spaces
		// we need to create a counter of white space and add the the size tempStringInput the count
		// of all white spaces
		
		System.out.println("Here is the array of stringInput split in substrings: " + Arrays.toString(tempStringInput));
		
		
		//String[] modifiedString = new String[2 * tempStringInput.length - 1];
		
		String modifiedString = "";
		String lastResult = "";
		
		int count = tempStringInput.length - 1;
		
		System.out.println("Count of white spaces is: " + count);
		
		for (int i = 0; i < (tempStringInput.length); i++) { 
			modifiedString += tempStringInput[i] + "%20";
			 if (i == tempStringInput.length - 1) {
				modifiedString += tempStringInput[i];
			} 	
		} lastResult = modifiedString; // This is the most updated result
		                               // If set to the variable inside the loop,
		                               // we don't get the final result
		
		return lastResult;
	}
	
	
	public void setStreetAddr(String streetAddress) {
		String[] tempAddr = streetAddress.split(" ");
		String newStrName = "";
		
		Integer streetNumber = Integer.parseInt(tempAddr[0]);
		for (int i = 0; i < tempAddr.length; i++) {
			newStrName += tempAddr[i];
			if (i != tempAddr.length - 2) {
				newStrName += " ";
			} else {
				newStrName += ", ";
			}
		} 
		String streetName = newStrName;
		System.out.println("\nThe street name is: " + streetName);
		
	}

	public String getStringInputForManip() {
		return stringInputModified;
	}

	public void setStringInputForManip(String stringInputModified) {
		this.stringInputModified = stringInputModified;
	}
	

}
