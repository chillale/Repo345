package mapInterface;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapCl {
public static void main(String[] args) {
	LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
	linkedHashMap.put("sravan", 27);
	linkedHashMap.put("narayana", 46);
	linkedHashMap.put("tarun", 33);
	linkedHashMap.put("manju", 88);
	linkedHashMap.put("sravan", 77);
	linkedHashMap.put("bhavani", 11);
	linkedHashMap.put(null, null);
	
	
	
	Set<Entry<String, Integer>> entries = linkedHashMap.entrySet();	
	for(int i=0;i<entries.size();i++) {
		System.out.println(entries.toString());
		break;
	}
	
	System.out.println(linkedHashMap);
	System.out.println("here we are printing the keys");
	Set<String> keysSet = linkedHashMap.keySet();
	for(String singleKey:keysSet) {
		System.out.println(singleKey);
	}
	
	System.out.println("here we are printing the values");
	Collection<Integer> numberOfValues = linkedHashMap.values();
	Iterator<Integer> iterator = numberOfValues.iterator();
	
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	System.out.println("here we are printint the entries");
	Set<Entry<String, Integer>> entries1 = linkedHashMap.entrySet();
	for(Entry<String, Integer> singleEntry:entries1) {
		System.out.println(singleEntry);
	}
}
}
