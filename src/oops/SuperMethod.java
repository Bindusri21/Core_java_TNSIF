package oops;

class Payment1
{
	void process()
	{
		System.out.println("Processing payment using standard gateway ");
	}
}
class Gpay extends Payment1
{
	void process()
	{
		System.out.println("Processing payment vis google pay ");
	}
	
	void completeTransaction()
	{
		super.process();
		process();
	}
}

public class SuperMethod {

	public static void main(String[] args) {
			Gpay obj=new Gpay();
			obj.completeTransaction();
		}

}
