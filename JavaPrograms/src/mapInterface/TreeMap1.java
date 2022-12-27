package mapInterface;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap();
		treeMap.put("Sravan", "Vaishali");
		treeMap.put("Rakesh", "vishnu");
		treeMap.put("Rajesh", "karkatak");
		treeMap.put("Sunil", "Usha");
		treeMap.put("Vinay", "tarangini");
		System.out.println(treeMap);
		
		Set<String> keysSet = treeMap.keySet();
		
		Iterator<String> iterator = keysSet.iterator();
		while(iterator.hasNext()) {
		     System.out.println(iterator.next());
		}
		
		Collection<String> values = treeMap.values();
		Iterator<String> iterato1 = values.iterator();
		while(iterato1.hasNext()) {
			System.out.println(iterato1.next());
		}
		
		Set<Entry<String, String>> entries = treeMap.entrySet();
		Iterator<Entry<String, String>> iterato2 = entries.iterator();
		
		while(iterato2.hasNext()) {
			System.out.println(iterato2.next());
		}
	}

}
