package keywords;

class Person5
{
	
}
class Employee extends Person5
{
	
}
class Manager extends Employee

{
	
}

public class InstanceOfDemo1 {
	public static void main(String[] args) {
		Person5 person =new Person5();
		Employee emp=new Employee();
		Manager manager=new Manager();
		System.out.println(emp instanceof Employee); //true
		System.out.println(emp instanceof Person5); //true
		System.out.println(emp instanceof Manager); //false
		System.out.println(manager instanceof Manager);//true
		System.out.println(manager instanceof Employee);//true
		System.out.println(manager instanceof Person5);//true
		System.out.println(person instanceof Employee);//false
		System.out.println(person instanceof Manager);//false
		

	}


}
