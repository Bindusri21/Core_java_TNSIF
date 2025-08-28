package oops;

class Human
{
	private int age;
	private String name;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class BeforeEncapsulation {
	
	public static void main(String[] args) {
		Human obj=new Human();
		obj.setAge(12);
		obj.setName("Bindu");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		
		obj.setAge(16);
		obj.setName("Avyuu");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		

	}

}


