package vectorCollection;

import java.util.Vector;

public class GettingObjectsInCollection {
	public static void main(String[] args) {
		Vector v = new Vector<>();
		v.addElement("static");
		v.add("block");
		v.add("nonstatic");
		v.add("constructor");
		v.add(3, 100);
		System.out.println(v);
		System.out.println(v.get(1));
		System.out.println(v.elementAt(2));
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
	}

}
