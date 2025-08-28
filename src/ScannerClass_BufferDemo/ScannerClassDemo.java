package ScannerClass_BufferDemo;

//import the scanner class
//create a scanner object
//prompt the user input
//read input using scanner method
//validate
//close the scanner
import java.util.Scanner;
public class ScannerClassDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.nextLine();
		System.out.println(name);
		System.out.println("Enter your age");
		int age=scan.nextInt();
		System.out.println(age);
		scan.close();

	}

}