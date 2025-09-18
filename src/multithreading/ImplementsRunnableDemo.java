package multithreading;

class Eclipse1 implements Runnable
{

	@Override
	public void run() {
		for (int i=0;i<5;i++)
		{
			System.out.println("Eclipse id "+ " "+ Thread.currentThread().getId());
		}
		
	}
	
}
 

public class ImplementsRunnableDemo {

	public static void main(String[] args) {
		Eclipse1 obj=new Eclipse1();
		Thread obj1=new Thread(obj);
		obj1.start();
		System.out.println("Main method "+ " "+ Thread.currentThread().getId());

	}

}