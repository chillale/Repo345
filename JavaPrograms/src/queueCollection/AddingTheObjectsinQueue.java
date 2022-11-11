package queueCollection;

import java.util.LinkedList;
import java.util.Queue;

public class AddingTheObjectsinQueue {
	public static void main(String[] args) {
		Queue q = new LinkedList<>();
		q.offer(99);
		q.offer(7);
		q.offer(99);
		q.offer(87);
		System.out.println(q);
	}

}
