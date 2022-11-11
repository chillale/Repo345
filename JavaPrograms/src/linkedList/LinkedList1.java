package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<Character> a = new LinkedList<>();
		a.add('d');
		a.add('o');
		a.add('c');
		a.add('u');
		a.add('y');
		System.out.println(a.getFirst());
		System.out.println(a.getLast());
		a.addFirst('z');
		a.addLast('i');
		System.out.println(a);
		a.removeFirst();
		System.out.println(a);
		a.removeLast();
		System.out.println(a);
		//using for loop we are printing the objects
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		//using iterator method we have to print
		Iterator<Character> i = a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
