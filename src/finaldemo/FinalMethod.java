package finaldemo;

class EcommercePlatform {
	
    final void calculateDiscount()
    {
    	
        System.out.println("Base discount = 10%");
    }
}

class Amazon extends EcommercePlatform {
    // cannot override calculateDiscount() because it's final
}

public class FinalMethod {
	
    public static void main(String[] args) {
        Amazon obj = new Amazon();
        obj.calculateDiscount(); // calls parent method
    }
}