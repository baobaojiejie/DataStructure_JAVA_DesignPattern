package visitorPattern;

public class PlatinumMembership implements Membership{

	@Override
	public int annualFee() {
		
		return 199;
	}

	@Override
	public void accept(OfferVisitor o) {
		
		o.visitPlatinum(this);
	}

	@Override
	public String name() {
		
		return "Platinum Membership";
	}

}
