package creditCard;

public class CreditCard {
	
	private String type;
	private double creditLine;
	private double balance;
	private double interest;
	
	
	public CreditCard() {
		
	}
	
	public CreditCard(String type, Double creditLine, Double balance, Double interest) {
		super();
		this.type = type;
		this.creditLine = creditLine;
		this.balance = balance;
		this.interest = interest;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getCreditLine() {
		return creditLine;
	}
	public void setCreditLine(double creditLine) {
		this.creditLine = creditLine;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	
	
	

}
