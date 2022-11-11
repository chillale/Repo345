package comparator;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Integer integer = (Integer)o1;
		Integer integer1 = (Integer)o2;
		if(integer>integer1) {
			return 1;
		}
		else if(integer<integer1) {
			return -1;
		}
		return 0;
	}
	public static void main(String[] args) {
		Queue queue = new PriorityQueue(new QueueComparator());
		queue.offer(33);
		queue.offer(2);
		queue.offer(12);
		queue.offer(22);
		queue.offer(24);
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
//		for(Object list:queue) {
//			System.out.println(list.poll());
//		}
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
	}

	

}
