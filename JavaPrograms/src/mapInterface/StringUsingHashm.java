package mapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class StringUsingHashm {
	public static void main(String[] args) {
		String s="tester";
		char[] ch=s.toCharArray();
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for(int i=0;i<ch.length;i++) {
			hashMap.put(ch[i], i);
		}
		System.out.println(hashMap);
		Set<Character> keysSet = hashMap.keySet();
		Iterator<Character> iterator = keysSet.iterator();
		//After adding the values into the hashmap
		while(iterator.hasNext()) {
			Character singleKey = iterator.next();
			for(int i=0;i<ch.length;i++) {
				if(singleKey==ch[i]) {
					System.out.println(singleKey+ " "+i);
				}
			}
		}
		
		Collection<Integer> value = hashMap.values();
		Iterator<Integer> iterator1 = value.iterator();
		System.out.println("After printing the keys");
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		System.out.println("After printing the values");
		
		Set<Entry<Character, Integer>> entries = hashMap.entrySet();
		Iterator<Entry<Character, Integer>> iterator2 = entries.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
	}

}
