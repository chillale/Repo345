package queueCollection;

import java.util.LinkedList;
import java.util.Queue;

public class RemoveOneObjectInQueue {
	public static void main(String[] args) {
		Queue q = new LinkedList<>();
		q.offer(3);
		q.add(33);
		q.add(5);
		q.add(86);
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q);
		//peek method is used to know which element is goint to delete in the collection
		System.out.println(q.peek());
	}

}
