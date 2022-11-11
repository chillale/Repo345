package arrayListCollections;

import java.util.ArrayList;
import java.util.ListIterator;

public class AddingObjectUsinglistIteratorAddMethod {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList();
		a.add(2);
		a.add(24);
		a.add(3);
		a.add(5);
		a.add(6);
		System.out.println(a);
		ListIterator<Integer> i = a.listIterator();
		i.add(33);
		i.add(44);
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(a);
		
	}

}
