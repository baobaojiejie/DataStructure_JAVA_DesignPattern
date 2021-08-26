package visitorPattern;

public interface Membership {
    String name();
    int annualFee();
    void accept(OfferVisitor o);
}
