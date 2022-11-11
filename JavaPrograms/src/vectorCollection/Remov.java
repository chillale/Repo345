package vectorCollection;

import java.util.Vector;

public class Remov {
	public static void main(String[] args) {
		Vector v = new Vector<>();
		v.add("ramesh");
		v.addElement("suresh");
		v.add("vaitu");
		v.add("ramayhya");
		v.add(3, "vinay");
		System.out.println(v);
		v.removeElement("suresh");
		System.out.println(v);
		v.removeAllElements();
		System.out.println(v);
	}

}
