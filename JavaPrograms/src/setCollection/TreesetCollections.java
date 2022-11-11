package setCollection;

import java.util.TreeSet;

public class TreesetCollections {
	public static void main(String[] args) {
		TreeSet t = new TreeSet<>();
		t.add(4);
		t.add(87);
		t.add(23);
		t.add(16);
		t.add(98);
		System.out.println(t);//it will print in ascending order
		System.out.println(t.first());//it will print first object
		System.out.println(t.last());//it will print last object
		System.out.println(t);
		System.out.println(t.pollFirst());//it will delete the object;
		System.out.println(t.pollLast());//it will delete the last object;
		System.out.println(t);//it will print in ascending order
	}

}
