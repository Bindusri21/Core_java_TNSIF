package oops;

public class FoodItem {
	
	//properties or state
	
		String name;
		double price;
		String category;
		
		//behaviour
		
		void displayDetails()

		{
			System.out.println("Food Name "+name);
			System.out.println("Food price "+price);
			System.out.println("Food category "+category);
			System.out.println("................");
		}
		public static void main(String[] args) {
			FoodItem obj=new FoodItem();
			obj.name="burger";
			obj.price=50.6;
			obj.category="Fast food";
			
			FoodItem obj1=new FoodItem();
			obj1.name="panner pizza";
			obj1.price=239.7;
			obj1.category="itlian";
			
			obj.displayDetails();
			obj1.displayDetails();		
		}


}
