package arrayListCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveMethodAndIteratorinCollection {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList();
		a.add("vaishali");
		a.add("varun");
		a.add("tarun");
		a.add("varuntej");
		a.add("ramcharan");
		System.out.println(a);
		Iterator<String> i = a.iterator();
		while(i.hasNext()) {
			String s = i.next();
			if(s.equals("varuntej")) {
				i.remove();
				System.out.println("varuntej has been removed");
			}
		}
		System.out.println(a);
	}

}
