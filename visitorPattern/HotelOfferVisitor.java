package visitorPattern;

public class HotelOfferVisitor implements OfferVisitor{

	@Override
	public void visitStandard(StandardMembership s) {
		
		System.out.println("Discount for hotel is 10%.");
		
	}

	@Override
	public void visitPlatinum(PlatinumMembership p) {
		
		System.out.println("Discount for hotel is 15%.");
	}

	@Override
	public void visitGold(GoldMembership g) {
		
		System.out.println("Discount for hotel is 20%.");
	}

}
