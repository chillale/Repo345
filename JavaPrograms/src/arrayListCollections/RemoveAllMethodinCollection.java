package arrayListCollections;

import java.util.ArrayList;

public class RemoveAllMethodinCollection {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("pandu");
		a.add(99);
		a.add('d');
		a.add(12.9);
		ArrayList a1 = new ArrayList();
		a1.add("pandu");
		a1.add('r');
		a1.add("vaishali");
		a1.add(12.9);
		a.removeAll(a1);
		System.out.println(a);
		System.out.println(a.isEmpty());
	}

}
