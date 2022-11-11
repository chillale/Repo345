package arrayListCollections;

import java.util.ArrayList;
import java.util.ListIterator;

public class RemovingAllElementsInArrayList {
	public static void main(String[] args) {
		ArrayList<Character> a = new ArrayList();
		a.add('a');
		a.add('b');
		a.add('c');
		a.add('d');
		a.add('e');
		a.add('f');
		ListIterator<Character> i = a.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("reverse Order");
		while(i.hasPrevious()) {
			Character s = i.previous();
			if(s.equals('c')) {
				i.remove();
				System.out.println("c has been removed");
				break;
			}
		}
		System.out.println(a);
	}

}
