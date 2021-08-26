package visitorPattern;

public class GoldMembership implements Membership{

	@Override
	public int annualFee() {
		
		return 299;
	}

	@Override
	public void accept(OfferVisitor o) {
		
		o.visitGold(this);
		
	}

	@Override
	public String name() {
		
		return "Gold Membership";
	}

}
