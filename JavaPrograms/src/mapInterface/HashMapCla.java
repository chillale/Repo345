package mapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapCla {
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap= new HashMap<>();
		hashMap.put("sravan", 27);
		hashMap.put("naayana", 88);
		hashMap.put("anusuya", 99);
		hashMap.put("rajesh", 33);
		hashMap.put(null, null);
		hashMap.put("viraj", null);
		System.out.println(hashMap);
		System.out.println("here we are printint keys");
		
		Set<String> numberOfKeys = hashMap.keySet();
		
		for(String singleKey:numberOfKeys) {
			System.out.println(singleKey);
		}
		
		System.out.println("here we ae printing values");
		Collection<Integer> numberOfValues = hashMap.values();
		Iterator<Integer> iterator = numberOfValues.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	    System.out.println("here we are printing entry sets");
	    Set<Entry<String, Integer>> entries = hashMap.entrySet();
	    
	    for(Entry<String, Integer> singleEntry:entries) {
	    	System.out.println(singleEntry);
	    }
	}

}
