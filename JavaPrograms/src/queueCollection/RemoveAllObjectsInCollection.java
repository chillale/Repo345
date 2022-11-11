package queueCollection;

import java.util.LinkedList;
import java.util.Queue;

public class RemoveAllObjectsInCollection {
	public static void main(String[] args) {
		Queue q = new LinkedList<>();
		q.offer(99);
		q.offer("rajesh");
		q.add(98);
		q.add(44);
		Queue q1 = new LinkedList(q);
		q1.add("sravan");
		System.out.println(q1);
		while(!q1.isEmpty()) {
			System.out.println(q1.poll());
		}
		System.out.println(q1);
	}

}
