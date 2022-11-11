package setCollection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCollection {
	public static void main(String[] args) {
		TreeSet t = new TreeSet<>();
		t.add(2);
		t.add(3);
		t.add(54);//it will follow sorting technique
		t.add(9);//it will not allow duplicate values
		t.add(89);
		//t.add(null);//it will not allow null values
		//t.add("str");//it will not allow heterogenous values
		System.out.println(t);
		//we can perform descending order also
		Iterator i = t.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
