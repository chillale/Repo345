package arrayListCollections;

import java.util.ArrayList;

public class ContainsAllMethodinCollection {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("vaishali");
		a.add('s');
		a.add(33);
		a.add("karuna");
		System.out.println(a);
		ArrayList a1 = new ArrayList();
		a1.add("vaishali");
		a1.add('s');
		a1.add("kskks");
		System.out.println(a.containsAll(a1));
	}

}
