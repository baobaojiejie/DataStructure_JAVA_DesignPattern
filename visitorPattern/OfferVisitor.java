package visitorPattern;

public interface OfferVisitor {

	void visitStandard(StandardMembership s);
	void visitPlatinum(PlatinumMembership p);
	void visitGold(GoldMembership g);
}
