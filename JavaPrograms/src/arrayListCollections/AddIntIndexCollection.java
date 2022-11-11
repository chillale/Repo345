package arrayListCollections;

import java.util.ArrayList;

public class AddIntIndexCollection {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("vaishali");
		a1.add('t');
		a1.add(66.4);
		a1.add(4);
		ArrayList a = new ArrayList();
		a.add("rani");
		a.add('e');
		a.add(3.4);
		a.add(44);
		a.add(2, a1);
		System.out.println(a);
		
	}

}
