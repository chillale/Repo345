package collections;

import java.util.HashMap;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("sravan", 11);
		hashMap.put("bharath", 21);
		hashMap.put("anusuya", 10);
		hashMap.put("tarun", 33);
		hashMap.put("sravan", 88);
		System.out.println(hashMap);
	}

}
