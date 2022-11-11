package vectorCollection;

import java.util.Vector;

public class VectorCollection {
	public static void main(String[] args) {
		Vector v = new Vector<>();
		v.addElement("block");
		v.add("nonstatic");
		v.add("non static");
		v.add(3,"constructor");
		v.add("static block");
		System.out.println(v);
	}

}
