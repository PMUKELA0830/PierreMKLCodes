package creditCard;

import java.util.Scanner;

public class MenuAndLogic {
	
	VisaCreditCard visaCredCard = new VisaCreditCard();
	MCcreditCard mcCredCard = new MCcreditCard();
	DiscoverCreditCard discoverCredCard = new DiscoverCreditCard();
	
	
	
	public void menuLogic() {
		
			enterChoice();
	}
	
	
	//Instantiate a scanner to be used in the program
	Scanner input = new Scanner(System.in);
	
	//Let us define a public scanner
	// Below is a nice method that will
	// be used as our scanner throughout this program
	
	// public static Scanner enterInput() {
		// Scanner is treated as a class or object
		// Therefore it can be used as a data type
		// Let us instantiate a the Scanner object
		
		
		Scanner scannerInput = new Scanner(System.in);
		
		// Since the return type is Scanner, we will return 
		// a variable or object of that type
		// which in this case is scannerInput
		
		
		//		return scannerInput;
	//}
	
	
	public static void showMenu() {
		System.out.println("Welcome to our credit card interest charge calculator\n"
				+ "\nBelow are the options of what our calculator can do:"
				+ "\n1: Visa cards"
				+ "\n2: MasterCard cards"
				+ "\n3: Discover cards"
				+ "\n0: Exit\n");
	}
	
	
	public void enterChoice() {
		
		
		System.out.print("Please enter you choice: ");
		int choice = input.nextInt();
		double interestCharge = 0.0;
		double balance = 0.0;
		
		while (choice != 5) {
		switch (choice) {
		
		case 1: {//Find Visa cards interest charge
			
			//Get the balance from the user using this predefined scanner method
			//called getBalanceForCredCard()
			
			//Now set the balance on the visaCredCard object to be the value 
			//stored in the variable balance. This is just for safety
			visaCredCard.setBalance(getBalanceForCredCard());
			
			//Now use the getter of this object to pass in the balance into the 
			//method to find the interest charge. Note that we also could have used
			//just the variable balance and gotten the same result
			interestCharge = interestChargeVisa(visaCredCard.getBalance());
			
			//Now let us print out the result to the console output
			System.out.println("\nThe current interest charge on your credit card is: " + interestCharge + "\n\n");
			enterChoice();
			break;
		}
		
		case 2: {//Find MasterCard cards interest charge
			
			
			mcCredCard.setBalance(getBalanceForCredCard());
			
			//You can take the long way about it by creating a variable outside the switch case statement
			//and assign a value of getBalance() to it since this method return a double type of value
			//It should be done as follows:
			// balance = getBalanceForCredCard();
			
			//case 3 implements this way of setting the balance using a variable called balance.
			interestCharge = interestChargeMC(mcCredCard.getBalance());
			
			System.out.println("\nThe current interest charge on your credit card is: " + interestCharge + "\n\n");
			enterChoice();
			break;
		}
		
		case 3: {//Find Discover cards interest charge
			
			balance = getBalanceForCredCard();
			
			discoverCredCard.setBalance(balance);
			interestCharge = interestChargeDiscover(discoverCredCard.getBalance());
			
			System.out.println("\nThe current interest charge on your credit card is: " + interestCharge + "\n\n");
			enterChoice();
		}
		
		case 0: {
			System.out.println("\nThank you for using our program!");
			
			//Here is one way of terminating a program
			System.exit(choice);
		}
		
		default: {
			System.out.println("Invalid entry, please enter a number from 0 to 3!\n");
			enterChoice();
		}
		}
		}
		
	}
	
	
	
	public double getBalanceForCredCard() {
		double balance = 0;
		// Prompt the use to enter the balance on the credit card
	
		System.out.print("\nPlease enter current balance on your credit card: ");
		balance = input.nextDouble();
		
		
		return balance;
	}
	
	
	
	// [1] Visa credit card interest charge
	public double interestChargeVisa(double balance) {
		
		
		// Set the interest value of visa card to 10% or 0.1
		
		visaCredCard.setInterestForVisa(0.1);
		
		// Calculating the interest charge on the visa credit card
		double interestCharge = visaCredCard.getVisaInterest() * visaCredCard.getBalance();
		
		return interestCharge;
	}
	
	// [2] MC credit card interest charge
	public double interestChargeMC(double balance) {
		
		// set the interest value for MC card to 5% or 0.05
		
		mcCredCard.setInterestForMC(0.05);
		// Calculating the interest charge on the MC credit card
		double interestCharge = mcCredCard.getInterestForMC() * mcCredCard.getBalance();
		
		return interestCharge;
	}
	
	// [3] Discover credit card interest charge
		public double interestChargeDiscover(double balance) {
			
			// set the interest value for Discover to 1% or 0.01
			
			discoverCredCard.setInterestForDiscover(0.01);
			
			// Calculating the interest charge on the MC credit card
			double interestCharge = discoverCredCard.getInterestForDiscover() * discoverCredCard.getBalance();
			
			return interestCharge;
		}
	
	
	

}
