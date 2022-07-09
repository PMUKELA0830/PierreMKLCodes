package creditCard;

public class VisaCreditCard extends CreditCard{
	
	CreditCard visaCreditCard = new CreditCard();
	private double interestForVisa;

	public void setInterestForVisa(double interestForVisa) {
		this.interestForVisa = interestForVisa;
	}

	public double getVisaInterest() {
		
		return this.interestForVisa;
		
	}
}
