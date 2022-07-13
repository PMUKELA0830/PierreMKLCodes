
/*
* Pierre Mukela
*
* Java Full Stack
* Lab 2
* Date: April 15, 2022
*
* Instructor: Brandon Owens
*/
package challengeCode2;

import java.util.Scanner;

public class ChallengeCode2 {
	public static void main(String[] args) {
		System.out.println(
				"Hello and welcome to the multi-solver tool! \n" + "Below are the things this tools can do: \n");
		int counter = 0;
		while (counter != 8) {
			System.out.println("1 = Calcute the area and the circumference of a circle");
			System.out.println("2 = Calculate the area of a triangle");
			System.out.println("3 = Determine whether a number is even or odd");
			System.out.println("4 = Adding a decimal place to a whole number");
			System.out.println("5 = Find the ASCII value of a character");
			System.out.println("6 = Round a decimal number to the nearest whole number");
			System.out.println("7 = Determine whether a year is a leap year");
			System.out.println("8 = Exit \n");
			break;
		}
		System.out.print("What do you want to do? ");
		Scanner input = new Scanner(System.in);
		int option = input.nextInt();
		if (option == 1) {
// Question1: Finding the area and circumference of a given circle
			double radius = 1.0;
			String parameters = circleParameters(radius);
			System.out.println(parameters + "\n");
		} else if (option == 2) {
// Question2: Calculating the area of a triangle
			double base = 1, height = 2;
			double area = triangleArea(base, height);
			System.out.println("The area of triangle is: " + area + "\n");
		} else if (option == 3) {
// Question3: determining if a given number is even or odd
			int num1 = 1;
			String isEvenOrOdd = EvenOrOdd(num1);
			System.out.println(isEvenOrOdd);
		} else if (option == 4) {
// Question4: Convert a whole number to a decimal one
			int wholeNumber = 1;
			String convertedNum = convertedNumber(wholeNumber);
			System.out.println(convertedNum);
		} else if (option == 5) {
// Question5: Finding the ASCII value of character
			char letterChar = 0;
			String asciiValueOfLetter = asciiValue(letterChar);
			System.out.println(asciiValueOfLetter);
		} else if (option == 6) {
// Question6: Rounding a number
			double number1 = 1.2;
			String resultRounded = roundedNumber(number1);
			System.out.print(resultRounded);
		} else if (option == 7) {
// Question7: Determining whether a year is a leap year
			int year = 1;
			leapYear(year);
		} else {
		}
	}

	/*
	 * 1. Write a method to prompt the user to enter the radius of the circle then
	 * calculate the area and circumference of the circle.
	 */
	public static String circleParameters(double radius) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the value of the radius: ");
		radius = input.nextDouble();
		double area = 0;
		double circumference = 0;
		double piValue = 3.142857;
		area = piValue * radius * radius;
		circumference = 2 * piValue * radius;
		String parameters1 = "The area of the circle is: " + area + " and the circumference " + "is: " + circumference;
		return parameters1;
	}

	/*
	 * 2. Write a method to prompt the user for base-width and height of a triangle,
	 * then calculate the area of the Triangle.
	 */
	public static double triangleArea(double base, double height) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the triangle base value: ");
		base = input.nextDouble();
		System.out.print("Please enter the triangle height value: ");
		height = input.nextDouble();
		double triangleOfArea = 0;
		triangleOfArea = 0.5 * base * height;
		return triangleOfArea;
	}

	/*
	 * 3. Write a method to prompt the user for a number then display check if the
	 * number is Even or Odd.
	 */
	public static String EvenOrOdd(int num1) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		num1 = input.nextInt();
		String isEvenOrOdd = "Even";
		if (num1 % 2 == 0)
			isEvenOrOdd = "Even";
		else if (num1 % 2 == 1)
			isEvenOrOdd = "Odd";
		String result = "The number " + num1 + " " + isEvenOrOdd + "\n";
		return result;
	}

	/*
	 * 4. Write a method to prompt the user for an Integer then display the same
	 * value with one decimal place. eg user enter "15 " result is:
	 * "You entered 15, the new value is 15.0".
	 */
	public static String convertedNumber(int wholeNumber) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a whole number: ");
		wholeNumber = input.nextInt();
		double convertedNum = (double) wholeNumber;
		String result = "The converted number is :" + convertedNum + "\n";
		return result;
	}

	/*
	 * 5. Write a method to prompt the user for a letter of the alphabet and display
	 * it's ascii value.
	 */
	public static String asciiValue(char letterChar) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a letter: ");
		letterChar = input.next().charAt(0);
		int asciiValueOfLetter = 0;
		asciiValueOfLetter = (int) letterChar;
		String result = "The ASCII value of " + letterChar + " is : " + asciiValueOfLetter + "\n";
		return result;
	}

	/*
	 * 6. Write a method to prompt the user for a double then display the value as a
	 * whole number. eg user enter "15 .8" result is: "You entered 15.8, the new
	 * value is 16". eg user enter "15 .4" result is: "You entered 15.4, the new
	 * value is 15".
	 */
	public static String roundedNumber(double number1) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a decimal number: ");
		number1 = input.nextDouble();
		int resultRounded = 1;
		resultRounded = (int) Math.round(number1);
		String result = "The rounded result for " + number1 + " is : " + resultRounded + "\n\n";
		return result;
	}

	/*
	 * 7. Write a method to prompt the user for 4 digits representing a year. Then
	 * determine If Year Is a Leap Year. How to determine whether a year is a leap
	 * year To determine whether a year is a leap year, follow these steps: 1. If
	 * the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5. 2.
	 * If the year is evenly divisible by 100, go to step 3. Otherwise, go to step
	 * 4. 3 .If the year is evenly divisible by 400, go to step 4. Otherwise, go to
	 * step 5. 4. The year is a leap year (it has 366 days). 5. The year is not a
	 * leap year (it has 365 days).
	 *
	 */
	public static void leapYear(int year) {
		Scanner input6 = new Scanner(System.in);
		System.out.print("Please enter a year : ");
		year = input6.nextInt();
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is a leap year. \n");
				} else {
					System.out.println(year + " is not a leap year. \n");
				}
			} else {
				System.out.println(year + " is a leap year. \n");
			}
		} else {
			System.out.println(year + " is not a leap year. \n");
		}
	}
}