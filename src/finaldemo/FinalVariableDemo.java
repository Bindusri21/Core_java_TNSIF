package finaldemo;

//upi app transaction limit
class UPI
{
	final int Max_Daily_limit=100000;

	
	void showLimit()
	{
		System.out.println("Daily transfer limit : "+Max_Daily_limit);
	}
}


public class FinalVariableDemo {

	public static void main(String[] args) {
		UPI obj=new UPI();
		obj.showLimit();
	
	}

}