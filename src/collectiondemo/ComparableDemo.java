package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
class Person6 implements Comparable<Person6>
{
	String name;
	int age;
	
	public Person6(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	void display()
	{
		System.out.println("Name :"+  name +"  age :"+age);
	}
	//sort by name
	public int compareTo(Person6 other)
	{
		return this.name.compareTo(other.name);
	}
}
public class ComparableDemo {
public static void main(String[] args) {
		ArrayList<Person6> people=new ArrayList<>();
		people.add(new Person6("John",26));
		people.add(new Person6("Anil",29));
		people.add(new Person6("Sushma",71));
		
		Collections.sort(people);
		
		for(Person6 person:people)
		{
			person.display();
		}

	}

}
