package letterCode;

import java.util.Scanner;

public class LetterCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		while (counter != 5) {
			System.out.println("1 = Encode a message");
			System.out.println("2 = Decode a message ");
			System.out.println("3 = Exit");
			break;
		}
		System.out.print("What do you want to do? ");
		int option = input.nextInt();
		switch (option) {
		case 1: {
			System.out.println("Please enter the message to be encoded: ");
			String messageToEncode = input.nextLine();
			String encodedMessage = Encode(messageToEncode);
			
			System.out.println("Your encoded message is: " + encodedMessage);
			
			break;
		
		}
		case 2: {
			System.out.println("Please enter the message to be decoded: ");
			String messageToDecode = input.nextLine();
			String decodedMessage = Decode(messageToDecode);
			
			System.out.println("Your encoded message is: " + decodedMessage);
			
			break;
		}
		case 3: {
			System.out.println("Thank you for using our program!");
			
			System.exit(0);
		}
			
		}
		}
		
		
		
		
	
	
	
	public static String Encode(String message) {
		
		String encodedMessage = "";
		
		
		char[] messageArr = message.toCharArray();
		// Split the message
		
		
		
		for (int i = 0; i < message.length(); i++) {
			
			int asciiLetter = (int) messageArr[i];
			
			if (messageArr[i] == ' ') {
				
				encodedMessage += " " + Character.toString(0);
			}
			
			else if (Character.isLetter(messageArr[i]) == false) {
				encodedMessage += " " + Character.toString(99);
			}
			
			else if (Character.isUpperCase(messageArr[i]) == true) {
				encodedMessage += " " + Character.toString(asciiLetter - 64);
				}
			
			else if (Character.isLowerCase(messageArr[i]) == true) {
				encodedMessage += " " + Character.toString(asciiLetter - 96);
			}
			}
		
		
		
		return encodedMessage;
	}
	
	public static String Decode(String message) {
		
		String decodedMessage = "";
		//char[] messageArr = message.toCharArray();
		
		String[] messageSplit = message.split(",");
		
		
		for (int i = 0; i < messageSplit.length; i++) {
			
			int asciiNumber = (int)messageSplit[i].charAt(0);
			
			if (Integer.parseInt(messageSplit[i]) == 0) {
				
				decodedMessage += " ";
				
			}
			
			else if (Integer.parseInt(messageSplit[i]) >= 1 && Integer.parseInt(messageSplit[i]) <= 26) {
				decodedMessage += (char)(Integer.parseInt(messageSplit[i]) + 64);
			}
			
			else if (Integer.parseInt(messageSplit[i]) == 99) {
				decodedMessage += " ?#";
			}
			
		}
		
		return decodedMessage;
	}

}
