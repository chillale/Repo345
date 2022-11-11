package setCollection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCollection {
	public static void main(String[] args) {
		HashSet s = new HashSet<>();
		s.add("varun");
		s.add(2);
		s.add(320);
		s.add(22);
		s.add(12);
		s.add("hello");
		System.out.println(s);
		
		Iterator i =s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
