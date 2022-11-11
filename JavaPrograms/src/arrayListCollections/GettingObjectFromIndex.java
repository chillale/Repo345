package arrayListCollections;

import java.util.ArrayList;

public class GettingObjectFromIndex {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(44);
		a.add("sravan");
		a.add(23);
		a.add('i');
		ArrayList a1 = new ArrayList(a);
		a1.add("vaishali");
		a1.add('t');
		a1.add(44);
		System.out.println(a1);
		System.out.println(a.get(2));
		
		
		
	}

}
