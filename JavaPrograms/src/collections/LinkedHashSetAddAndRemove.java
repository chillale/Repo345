package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetAddAndRemove {
	public static void main(String[] args) {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("sravan");
		linkedHashSet.add("anusuya");
		linkedHashSet.add("tarun");
		linkedHashSet.add("prakash");
		linkedHashSet.add("sravan");
		System.out.println(linkedHashSet);
		System.out.println(linkedHashSet.contains("sravan"));
	}

}
