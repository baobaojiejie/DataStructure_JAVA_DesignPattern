package visitorPattern;

public class Main {

	public static void main(String[] args) {
		
		OfferVisitor visitor1 = new HotelOfferVisitor();
		OfferVisitor visitor2 = new BudgetOfferVisitor();
		
		Membership mem1 = new StandardMembership();
		Membership mem2 = new PlatinumMembership();
		Membership mem3 = new GoldMembership();
		
		display(mem1);
		mem1.accept(visitor2);
		mem2.accept(visitor1);
		mem3.accept(visitor2);
	}
	
	public static void display(Membership m) 
	{
		System.out.print(m.name()+" with annual fee "+ m.annualFee()+" dollars per year enjoy ");
	}

}
