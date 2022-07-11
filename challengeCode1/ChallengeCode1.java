package challengeCode1;

import java.util.Scanner;

public class ChallengeCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to our digit filter for string");
		System.out.print("\nPlease enter the string for digits to be sorted out: ");
		String string1 = input.nextLine();
		int result = findDigits(string1);
		
		System.out.println("\nYour filter result times the length of your string input is: " + result);

	}
	
	public static int findDigits(String string1) {
		
		int result = 1;
		String digitPart = "";
		
		char[] string1Arr = string1.toCharArray();
		
		for (int i = 0; i < string1Arr.length; i++) {
			
			if (Character.isDigit(string1Arr[i]) == true) {
				
				digitPart += string1Arr[i];
				// Or you can use " digitPart += String.valueOf(string1Arr[i]); "
			}
		} result = Integer.parseInt(digitPart) * string1Arr.length;
		
		return result;
	}

}
