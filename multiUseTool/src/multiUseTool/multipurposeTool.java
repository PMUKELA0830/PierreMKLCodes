package multiUseTool;

import java.util.Scanner;

public class multipurposeTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Welcome the user and show them the menu
		
		showMenu();
		

	}
	
	public static void showMenu() {

		System.out.println(
				"\nWelcome to the string manipulator tool! \n " + " Please find the list of things we can do below: \n");
		int counter = 0;
		while (counter != 5) {
			System.out.println("1 = Remove all repeated letter, whether uppercase or" + "lowercase");
			System.out.println("2 = Remove duplicate letters ");
			System.out.println("3 = Count vowels and consonants in a word");
			System.out.println("4 = Move repeated characters in a word to the end" + "respectively");
			System.out.println("5 = Exit \n");
			break;
		}
		System.out.print("What do you want to do? ");
		Scanner input = new Scanner(System.in);
		int option = input.nextInt();
		switch (option) {
		case 1: {
			// Question 1
			String str1 = " ";
			removeChar(str1);
			showMenu();
			break;
		
		}
		case 2: {
			// Question 2
			String wordWithDuplicates = " ";
			char str2[] = "".toCharArray();
			removeDuplicate(wordWithDuplicates);
			showMenu();
			break;
		}
		case 3: {
			// Question 3
			String str3 = " ";
			vowelConsonantCounter(str3);
			showMenu();
			break;
		}
		case 4: {
			// Question 4
			String word1 = " ";
			repeatedCharMovedToEnd(word1);
			showMenu();
			break;
		}
		case 5: {
			System.out.println("\nThank you for using our program!");
			System.exit(0);
		}
		default:
			System.out.println("Error: Please enter a number 1-5!");
		}

	}

	/*
	 * 1. Write a method to remove a given character from a string. E.g. remove all
	 * 'Aa' from Averange should return vernge
	 */
	public static void removeChar(String str1) {
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter a word
		System.out.print("Please enter a word or phrase you need to remove characters from: ");
		str1 = input.nextLine();
		char[] charArr = str1.toCharArray();
		// Prompt the user to enter the character to be removed
		System.out.print("Please enter the character (in lowercase) that needs to be removed: ");
		char charToRemove = input.next().charAt(0);
		String charToKeep = "";
		// Create a variable with the uppercase letter value of the character to be
		// removed
		String charToRemoveString = Character.toString(charToRemove);
		String charToRemoveStrCapital = charToRemoveString.toUpperCase();
		char charToRemove1 = charToRemoveStrCapital.charAt(0); // Uppercase value of the
		// the character to be removed

		int counter = 0;
		for (int i = 0; i < charArr.length; i++) {

			if (charToRemove1 == charArr[i]) {
				counter += 0;
				charToKeep = charToKeep + "";
			} else if (charToRemove != charArr[i]) {
				counter += 1;
				charToKeep = charToKeep + charArr[i];
			} else {
				counter += 0;
				charToKeep = charToKeep + "";
			}
		}
		System.out.println("\nYour modified string is: " + charToKeep + "\n");
	}
	
	

	/*
	 * 2. Write a method to remove duplicate characters from a string. This method
	 * will remove duplicates and leave one character of the same.
	 */
	public static void removeDuplicate(String wordWithDuplicates) {
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter a word with duplicate letters and nonRepeatedLetters
		System.out.print("\nPlease enter a word that has duplicate letters: ");
		wordWithDuplicates = input.nextLine();
		char[] charArr = wordWithDuplicates.toLowerCase().toCharArray();
		int count;
		String nonRepeatedLetters = "";
		for (int i = 0; i < charArr.length; i++) {
			count = 0;
			for (int j = 0; j < charArr.length; j++) {
				if (charArr[i] == charArr[j]) {
					count++;
				}
			}
			if (count == 1) {
				nonRepeatedLetters += charArr[i];
			}
		}
		System.out.println("\nYour modified string is: " + nonRepeatedLetters + "\n");
	}
	/*
	 * 3. Write a method to count the number of vowels and consonants in a string.
	 * E.g. if the input is Java the result should be 2 vowels and 2 consonants.
	 */

	static void vowelConsonantCounter(String str3) {
		// Counter variable to store the count of vowels and consonant
		int vCount = 0, cCount = 0;

		Scanner input = new Scanner(System.in);
		// Prompt the user to enter a word for vowel and consonants count

		str3 = "This is a really simple sentence";
		System.out.print("\nPlease enter a word: ");
		str3 = input.nextLine();

		// Converting entire string to lower case to reduce the comparisons
		str3 = str3.toLowerCase();

		for (int i = 0; i < str3.length(); i++) {
			// Checks whether a character is a vowel
			if (str3.charAt(i) == 'a' || str3.charAt(i) == 'e' || str3.charAt(i) == 'i' || str3.charAt(i) == 'o'
					|| str3.charAt(i) == 'u') {
				// Increments the vowel counter
				vCount++;
			}
			// Checks whether a character is a consonant
			else if (str3.charAt(i) >= 'a' && str3.charAt(i) <= 'z') {
				// Increments the consonant counter
				cCount++;
			}
		}
		System.out.println("\nNumber of vowels: " + vCount);
		System.out.println("Number of consonants: " + cCount);
	}

	/*
	 * 4.Write a method to display first non repeated character of a string then the
	 * repeating characters. E.g. input morning should display morignn.
	 */
	public static void repeatedCharMovedToEnd(String word1) {
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter a word with duplicate letters and nonRepeatedLetters
		System.out.print("\nPlease enter a word that has duplicate letters: ");
		word1 = input.nextLine();
		char[] charArr = word1.toLowerCase().toCharArray();
		int count;
		String nonRepeatedLetters = "";
		String repeatedLetters = "";
		for (int i = 0; i < charArr.length; i++) {
			count = 0;
			for (int j = 0; j < charArr.length; j++) {
				if (charArr[i] == charArr[j]) {
					count++; // When you exit this block (if statement block)
					// the value of count within this block will be lost because
					// after traversing the inner loop or the condition in the inner
					// loop being false, you go back to the outer loop and the stored
					// value in the variable count is 0, which means your count
					// restarts here
				}
			}
			if (count == 1) {
				nonRepeatedLetters += charArr[i];
			} else {
				repeatedLetters = repeatedLetters + charArr[i];
			}
		}
		System.out.println("\nYour modified string is: " + nonRepeatedLetters + repeatedLetters + "\n");
	}

}
