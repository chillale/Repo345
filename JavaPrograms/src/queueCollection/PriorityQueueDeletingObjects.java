package queueCollection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDeletingObjects {
	public static void main(String[] args) {
		Queue q = new PriorityQueue<>();
		q.offer(12);
		q.add(44);
		q.add(33);
		q.add(99);
		System.out.println(q);
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
