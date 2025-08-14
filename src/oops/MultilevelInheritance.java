package oops;

class Device
{
	void deviceType()
	{
		System.out.println("I am an eletronic device");
	}
}

class Phone extends Device
{
	void brand()
	{
		System.out.println("Brand : Samsung");
	}
}

class SmartPhone extends Phone
{
	void features()
	{
		System.out.println("Features : Touchscreen,camera,Internet");
	}
}

public class MultilevelInheritance {
	
	public static void main(String[] args) {
		SmartPhone sp= new SmartPhone();
		sp.deviceType();
		sp.brand();
		sp.features();

	}

}
