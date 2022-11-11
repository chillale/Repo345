package arrayListCollections;

import java.util.ArrayList;


public class LastIndexOfMethodInCollection {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("vaishali");
		a.add(13);
		a.add("12.4");
		a.add('s');
		a.add(13);
		System.out.println(a);
		System.out.println(a.lastIndexOf(13));
		System.out.println(a.indexOf(13));
	}

}
