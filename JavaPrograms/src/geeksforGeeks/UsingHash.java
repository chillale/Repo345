package geeksforGeeks;

import java.util.HashMap;

public class UsingHash {
	public static void main(String[] args) {
		String s = "aaabbbddcccdddee";
		char[] ch = s.toCharArray();
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		int count;
		for (int i = 0; i < ch.length; i++) {
			if (hashMap.containsKey(ch[i])) {
				count = hashMap.get(ch[i]);
				count++;
				hashMap.replace(ch[i], count);
			} else {
				hashMap.put(ch[i], 1);
			}
		}

		for (Character single : hashMap.keySet()) {
			System.out.println(single + " " + hashMap.get(single));
		}
	}
}
