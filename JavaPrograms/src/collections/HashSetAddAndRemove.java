package collections;

import java.util.HashSet;

public class HashSetAddAndRemove {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("sravan");
		hashSet.add("anusuya");
		hashSet.add("tarun");
		hashSet.add("sravan");
		System.out.println(hashSet);
	}

}
