package multithreading;

class Eclipse2 extends Thread
{
	public void run() {
		System.out.println("Eclipse id "+ " "+ Thread.currentThread().getId());
	}
	
}
class OneNote2 extends Thread
{
	public void run() {
		System.out.println("OneNote id"+ " "+ Thread.currentThread().getId());
	}

}
class Chrome2 extends Thread
{
	public void run() {
		System.out.println("Chrome id "+ " "+ Thread.currentThread().getId());
	}
}

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		Eclipse2 obj=new Eclipse2();
		obj.start();
		obj.setPriority(Thread.MAX_PRIORITY);//10
		OneNote2 obj1=new OneNote2();
		obj1.start();
		obj1.setPriority(Thread.MIN_PRIORITY);//1
		Chrome2 obj2=new Chrome2();
		obj2.start();
		obj2.setPriority(Thread.NORM_PRIORITY);//5
		
	
		//eclipse
		//chrome
		//onenote
	}

}