package visitorPattern;

public class BudgetOfferVisitor  implements OfferVisitor {

	@Override
	public void visitStandard(StandardMembership s) {
		
		System.out.println("Budget carRental 5% off.");
	}

	@Override
	public void visitPlatinum(PlatinumMembership p) {
		
		System.out.println("Budget carRental 15% off.");
		
	}

	@Override
	public void visitGold(GoldMembership g) {
		
		System.out.println("Budget carRental 25% off.");
	}

}
