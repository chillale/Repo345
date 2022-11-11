package arrayListCollections;

import java.util.ArrayList;

public class RemoveObjectInCollection {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("rajesh");
		a.add(3);
		a.add('j');
		a.add("khanna");
		System.out.println(a.remove(2));
		System.out.println(a);
		ArrayList a1 = new ArrayList();
		a1.add("kanakam");
		a1.add("vishwak");
		a1.addAll(a);
		System.out.println(a1);
	}

}
