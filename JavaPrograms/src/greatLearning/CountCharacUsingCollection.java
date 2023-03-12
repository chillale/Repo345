package greatLearning;

import java.util.HashMap;

public class CountCharacUsingCollection {
	public static void main(String[] args) {
		String s = "Automation";
		char ch[]=s.toCharArray();
		int count=0;
		HashMap<Character, Integer> hash = new HashMap();
		for(int i=0;i<ch.length;i++) {
			char ch1=ch[i];
			if(hash.containsKey(ch[i])) {
				hash.put(ch1, hash.get(ch1)+1);
			}else {
				hash.put(ch1, 1);
			}
		}
		for(Character c:hash.keySet()) {
			System.out.println(c+" "+hash.get(c));
		}
	}

}
