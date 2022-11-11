package arrayListCollections;

import java.util.ArrayList;
import java.util.ListIterator;

public class PrintingValuesUsingListIterator {
	public static void main(String[] args) {
		ArrayList<Character> a = new ArrayList();
		a.add('a');
		a.add('d');
		a.add('c');
		a.add('e');
		a.add('o');
		System.out.println(a);
		ListIterator<Character> i = a.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("reverse order");
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
	}

}
