package polymorphism;

class Calculator
{
	int add(int a, int b)
	{
		return a+b;
	}
	double add(double a , double b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
}

public class MethodOverloadingDemo {
	
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		System.out.println("add(double , double) ->"+calc.add(3.5,5.6));
		System.out.println("add(int ,int,int) ->"+calc.add(2,4,5));
		System.out.println("add(int ,int) ->"+calc.add(2, 1));

	}

}
