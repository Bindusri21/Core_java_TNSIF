package corejava_svit;

public class TypeCastingDemo {

	public static void main(String[] args) {
		//widening 
		int quatity=3;
		double priceperitem=99.50;
		double totalprice= quatity*priceperitem;
		
		//narrowing
		
		double discount=10.75;
		int roundedDiscount =  (int)discount;
		
		double finalAmount =totalprice-roundedDiscount;
		
		System.out.println("Online Shopping summary");
		System.out.println("final amount "+finalAmount);
	}
}