package arrayListCollections;

import java.util.ArrayList;

public class RetainAllMethodInCollection {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("vaishali");
		a.add("karuna");
		a.add('e');
		a.add(12.3);
		System.out.println(a);
		ArrayList a1 = new ArrayList();
		a1.add('w');
		a1.add("vaishali");
		a1.add('e');
		a1.add("rajesh");
		a1.retainAll(a);
		System.out.println(a1);
	}

}
