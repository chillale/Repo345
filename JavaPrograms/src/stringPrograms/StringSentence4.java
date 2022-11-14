package stringPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class StringSentence4 {
	public static void main(String[] args) {
		String s = "testyantra";
		char[] ch=s.toCharArray();
		
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		
		
		for(int i=0;i<ch.length;i++) 
		{
			if(hashMap.containsKey(ch[i])) {
				hashMap.put(ch[i], hashMap.get(ch[i])+1);
			}
			else
			{
				hashMap.put(ch[i], 1);				
			}
		}
		
		Set<Entry<Character, Integer>> entries = hashMap.entrySet();
		
		Iterator<Entry<Character, Integer>> iterator = entries.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

}
