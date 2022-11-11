package arrayListCollections;

import java.util.ArrayList;

public class AddingObjectsInColle {
	public static void main(String[] args) {
		ArrayList a = new ArrayList<>();
		a.add(4);
		a.add("vamsi");
		a.add(33);
		a.add(true);
		a.add(null);
		a.add(1, "sravan");
		System.out.println(a);
		ArrayList a1 = new ArrayList<>(a);
		System.out.println(a1);
		a1.add("sai");
		a1.add("showkah");
		System.out.println(a1);
		a.addAll(a1);
		System.out.println(a);
	}

}
