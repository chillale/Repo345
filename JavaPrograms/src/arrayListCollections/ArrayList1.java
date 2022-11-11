package arrayListCollections;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		System.out.println(a.isEmpty());
		a.add("sravan");
		a.add('s');
		a.add(11);
		a.add(32);
		System.out.println(a);
		ArrayList a1 = new ArrayList();
		a1.addAll(a);
		a1.add(98);
		a1.add('e');
		a1.add(a);
		System.out.println(a1);
	}
}
