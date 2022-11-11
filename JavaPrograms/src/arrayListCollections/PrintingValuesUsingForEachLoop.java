package arrayListCollections;

import java.util.ArrayList;

public class PrintingValuesUsingForEachLoop {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("rajehska");
		a.add(33);
		a.add('e');
		a.add(2.33);
		a.add(44);
		System.out.println(a);
		for(Object i:a) {
			System.out.println(i);
		}
	}

}
