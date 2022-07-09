package stringManip;

import java.util.Arrays;

public class StringManip1 {
	
	
	private String stringInputModified;
	
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
		String[] tempStringInput = stringInput.split(" "); 
		
		System.out.println("Here is the array of stringInput split in substrings: " 
				   + Arrays.toString(tempStringInput));
		
		
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
		} lastResult = modifiedString; 
		
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
