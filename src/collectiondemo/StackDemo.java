package collectiondemo;

import java.util.Stack;
public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		//adding an element
		stack.push(10); //top 1
		stack.push(20); //top 2
		stack.push(30); //top 3
		stack.push(40); //top 4
		//displaying the stack
		
		System.out.println("Stack after push operation" + stack);
		
		///looking at the top element without removing it
		
		System.out.println("top element" + stack.peek()); //40
		
		//Pop operation :Removing th element 
		System.out.println("Element popped" + stack.pop());
		System.out.println("Stack after pop" + stack);
		
		stack.clear();
		
		//check if stack is empty
		
		System.out.println("is stack empty " + stack.isEmpty());
		
		//searching for an element in the stack
		 int position=stack.search(20);
		 
		 if(position !=-1)
		 {
			 System.out.println("Element 2 found at the position  " + position);
		 }
		 else
		 {
			 System.out.println("Element 2 not found in the stack " +position);
		 }
	}

}
