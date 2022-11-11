package linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class AddingObjectIntheMiddle {
	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList<>();
		a.add(9);
		a.add(44);
		a.add(4);
		a.add(55);
		a.add(66);
		a.add(8);
		a.add(3, 100);
		System.out.println(a.get(3));
		System.out.println(a);
		ListIterator<Integer> li = a.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("Printing in Reverse Order");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
