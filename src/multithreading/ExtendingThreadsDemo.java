package multithreading;

class Eclipse extends Thread
{
	public void run() {
		System.out.println("Eclipse id "+ " "+ Thread.currentThread().getId());
	}
	
}
class OneNote extends Thread
{
	public void run() {
		System.out.println("OneNote id"+ " "+ Thread.currentThread().getId());
	}

}
class Chrome extends Thread
{
	public void run() {
		System.out.println("Chrome id "+ " "+ Thread.currentThread().getId());
	}
}

public class ExtendingThreadsDemo {

	public static void main(String[] args) {
		Eclipse obj=new Eclipse();
		obj.start();
		OneNote obj1=new OneNote();
		obj1.start();
		Chrome obj2=new Chrome();
		obj2.start();
		System.out.println("Main method "+ " "+ Thread.currentThread().getId());
	
		
	}

}