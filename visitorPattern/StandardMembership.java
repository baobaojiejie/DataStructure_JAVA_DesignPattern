package visitorPattern;

public class StandardMembership implements Membership{

	@Override
	public int annualFee() {
		
		return 99;
	}

	@Override
	public void accept(OfferVisitor o) {
		
		o.visitStandard(this);
		
	}

	@Override
	public String name() {
		
		return "Standard Membership";
	}

}
