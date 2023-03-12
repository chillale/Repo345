package vectorCollection;

import java.util.HashMap;
import java.util.Set;

public class Hashing {
	public static void main(String[] args) {
		String s="showkathali";
		HashMap<Character, Integer> hash = new HashMap();
		for(int i=0;i<s.length();i++) {
			if(hash.containsKey(s.charAt(i))) {
				hash.put(s.charAt(i), hash.get(s.charAt(i))+1);
			}else {
				hash.put(s.charAt(i), 1);
			}
		}
		System.out.println(hash);
		Set<Character> keys = hash.keySet();
		for(Character singleKey:keys) {
			if(hash.get(singleKey)>1)
			System.out.println(singleKey+" "+hash.get(singleKey));
		}
	}

}
