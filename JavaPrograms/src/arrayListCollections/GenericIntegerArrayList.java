package arrayListCollections;

import java.util.ArrayList;

public class GenericIntegerArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList();
		a.add(33);
		a.add(3);
		a.add(44);
		a.add(5);
		for(Integer i:a) {
			System.out.println(i);
		}
	}

}
