package arrayListCollections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(2);
		a.add(55);
		a.add(22);
		a.add(26);
		a.add(89);
		a.add(98);
		Collections.sort(a);
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
		
	}

}
