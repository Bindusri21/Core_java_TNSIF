package constructor;

class Student
{
	String name;
	int age;
	
	Student()
	{
		name="bindu";
		age=22;
		System.out.println(name + " " + age);
	}
	Student(String name)
	{
		this.name=name;
		System.out.println("Name :"+name);
	}
	Student(String name, int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Name : "+name +"Age : "+age);
	}
}

public class Constructor_Overloading {
	
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student("Alice");
		Student s3=new Student("bob",23);

	}

}
