package arrayListCollections;

import java.util.ArrayList;

public class AddAllObjectinCollectionIndex {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("sravan");
		a.add("karuan");
		a.add(23);
		a.add(null);
		ArrayList a1 = new ArrayList();
		a1.add("rani");
		a1.add('e');
		a1.add(22.4);
		a1.add(null);
		a1.addAll(1, a);
		System.out.println(a1);
	}

}
