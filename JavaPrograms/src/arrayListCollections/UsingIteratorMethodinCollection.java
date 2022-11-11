package arrayListCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIteratorMethodinCollection {
	public static void main(String[] args) {
		ArrayList<Character> a = new ArrayList();
		a.add('e');
		a.add('9');
		a.add('r');
		a.add(null);
		a.add('4');
		a.add('w');
		Iterator<Character> i = a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
