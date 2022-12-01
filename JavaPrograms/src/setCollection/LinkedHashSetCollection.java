package setCollection;

import java.util.LinkedHashSet;

public class LinkedHashSetCollection {
	public static void main(String[] args) {
		LinkedHashSet l = new LinkedHashSet<>();
		l.add("23");
		l.add("23");
		l.add(null);//it will not allow duplicates 
		l.add(null);
		l.add(true);
		l.add(true);
		System.out.println(l);
		System.out.println(l.remove(l));
		System.out.println(l);
	}

}
