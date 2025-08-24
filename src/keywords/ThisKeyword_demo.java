package keywords;

class Product
{
	double price;
	
	Product(double price)
	{
		this.price=price;
	}

double calculateDiscount()
{
	return this.price*0.10; //apply 10% discount
}
double calculateFinalPrice()
 {
	 return this.price-this.calculateDiscount();
 }

}

public class ThisKeyword_demo {
	
	public static void main(String[] args) {
		Product pd=new Product(400);
        System.out.println("Final price "+pd.calculateFinalPrice());
	}


}
