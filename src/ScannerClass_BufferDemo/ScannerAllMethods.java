package ScannerClass_BufferDemo;

import java.util.Scanner;
public class ScannerAllMethods{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.nextLine();
		
		System.out.println("Enter your age");
		int age=scan.nextInt();
		
		System.out.println("Enter your Height ");
		float height=scan.nextFloat();
		
		System.out.println("Are you a student?");
		boolean isstdent=scan.nextBoolean();
		
		System.out.println("Enter your aadhar number");
		long aadhar=scan.nextLong();
		scan.nextLine();
		
		System.out.println("Enter your favorite teacher");
		String teacher=scan.nextLine();
		
		System.out.println("Enter your hobby");
		String hobby=scan.nextLine();
		
		System.out.println("Enter your daily reading time in minutes");
		byte readingtime=scan.nextByte();
		
		System.out.println("Enter your CGPA");
		double cgpa=scan.nextDouble();
		
		System.out.println("Enter no of siblings you have");
		short siblings=scan.nextShort();
		
		System.out.println("Student information");
		System.out.println("Name " + name);
		System.out.println("Age " + age);
		System.out.println("height " + height);
		System.out.println("isstdent " + isstdent);
		System.out.println("aadhar " +aadhar);
		System.out.println("Favorite teacher " +teacher);
		System.out.println("Hobby " +hobby);
		System.out.println("readingtime " + readingtime);
		System.out.println("cgpa " + cgpa);
		System.out.println("siblings " +siblings);
		scan.close();
	}
}