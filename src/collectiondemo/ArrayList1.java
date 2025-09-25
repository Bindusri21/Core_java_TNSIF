package collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		List<String> fruits=new ArrayList<>();
		fruits.add("apple");
		fruits.add("Mango");
		fruits.add("Dragon Fruit");
		
		System.out.println("First fruit : "+fruits.get(0));
		
		fruits.set(2, "cherry");//modify ele
		
		if(fruits.contains("apple"));
		{
			System.out.println("Apple is in the list");
		}
		
		for(String fruit:fruits)
		{
			System.out.println(fruit);
		}
 
		fruits.remove(2);
		
		fruits.clear();
		System.out.println("list cleared no of fruits :"+fruits.size());
		System.out.println(fruits);
	}

}