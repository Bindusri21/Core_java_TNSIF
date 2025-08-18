package oops;

class Payment
{
	void makePayment()
	{
		System.out.println("Processing payment using generic method");
	}
}

//subclass bindusri
class UpiPayment extends Payment
{
	void makePayment()
	{
		System.out.println("Payment made using UPI");
	}
}

//Avyukta 
class CardPayment extends Payment
{
	void makePayment()
	{
		System.out.println("Payment made using credit/debit card");
	}
}

//keerthana
class  WalletPayment extends Payment
{
	void makePayment()
	{
		System.out.println("Payment made using Digital Wallet");
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		Payment payment;
		
		payment = new UpiPayment();
		payment.makePayment();
		
		payment = new CardPayment();
		payment.makePayment();
		
		payment = new WalletPayment();
		payment.makePayment();	

	}

}
