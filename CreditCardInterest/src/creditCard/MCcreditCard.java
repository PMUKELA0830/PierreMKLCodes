package creditCard;

public class MCcreditCard extends CreditCard{
	
	private double interestForMC;
	
	CreditCard MCcreditCard = new CreditCard();
	
	
	public double getInterestForMC() {
		return interestForMC;
	}

	public void setInterestForMC(double interestForMC) {
		this.interestForMC = interestForMC;
	}
}
