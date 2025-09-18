package collectionsdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		List<String> fruits=new Vector<>();
		
		//add the element to the arraylist
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("cherry");
		fruits.add("cherry");
		
		//access element
		
		System.out.println("First fruit :"+ fruits.get(0));
		
		//modify an element
		
		fruits.set(2, "Blueberry");
		
		//remove an element
		
		fruits.remove("cherry");
		
		//check if an element exists
		
		if(fruits.contains("Apple"))
		{
			System.out.println("apple is in the list");
		}
 
		//print all the element using for-each loop
		
		System.out.println("Fruits in the list");
		
		for(String fruit:fruits)
		{
			System.out.println(fruit);
		}
		
		
		//get the size of the arraylist
		
		System.out.println("Number of fruits "+fruits.size());
		
		//clear all the elements
		
		fruits.clear();
		
		System.out.println("List cleared " +fruits.size());
	}

}