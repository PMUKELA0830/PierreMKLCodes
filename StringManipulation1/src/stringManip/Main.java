package stringManip;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringManip1 stringManip = new StringManip1();
		
		System.out.println("Welcome to our string manipulator\n"
				+ "This tool replaces the white spaces in your\n"
				+ "string input with '%20' characters\n");
		
		Scanner input = new Scanner(System.in);
		
		String stringInput = "";
		System.out.print("\nPlease enter a word or phrase to be manipulated: ");
		
		//To input a sentence as string, use nextLine() in the scanner
		stringInput = input.nextLine();
		
		
		stringManip.setStringInputForManip(stringManip.splitStringAddCharr(stringInput));
		
		System.out.println("\nAfter manipulating your string input " + stringInput + ", the result is: " + stringManip.getStringInputForManip());
		
		
		String streetAddress = "";
		 System.out.println("\nPlease enter street address: ");
		 streetAddress = input.nextLine();
		 
		 String streetName = "";
		 stringManip.setStreetAddr(streetAddress);
		 
		 

	}

}
