package creditCard;

public class DiscoverCreditCard extends CreditCard{
	
	private double interestForDiscover;
	
	CreditCard DiscoverCreditCard = new CreditCard();
	
	public double getInterestForDiscover() {
		return interestForDiscover;
	}

	public void setInterestForDiscover(double interestForDiscover) {
		this.interestForDiscover = interestForDiscover;
	}
}
