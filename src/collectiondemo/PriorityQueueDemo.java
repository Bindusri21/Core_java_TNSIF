package collectiondemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
	Queue<Integer> pq=new PriorityQueue<>();

	//add element
	
	pq.offer(99);
	pq.offer(10);
	pq.offer(70);
	pq.offer(40);
	
	System.out.println(pq);
	System.out.println(pq.poll());
	System.out.println(pq);
	System.out.println(pq.poll());
	System.out.println(pq);
	
	}

}
