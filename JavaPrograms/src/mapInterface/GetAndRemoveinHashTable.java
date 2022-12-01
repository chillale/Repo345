package mapInterface;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class GetAndRemoveinHashTable {
	public static void main(String[] args) {
		Hashtable<String, Integer> hashTable = new Hashtable<>();
		hashTable.put("sravan", 33);
		hashTable.put("varun", 44);
		hashTable.put("narayana", 99);
		hashTable.put("anusuya", 77);
		hashTable.put("rajesh", 12);
		System.out.println(hashTable.get("sravan"));
		System.out.println(hashTable);
		hashTable.remove("anusuya");
		System.out.println(hashTable);
		System.out.println(hashTable.containsKey("sravan"));
		System.out.println(hashTable.containsValue(33));
		Set<String> keysSet = hashTable.keySet();
		System.out.println("Printing the keys");
		Iterator<String> iterator = keysSet.iterator();
		
		while(iterator.hasNext()) {
			String sinleKey = iterator.next();
			
		}
		System.out.println("printing the values");
		Collection<Integer> value = hashTable.values();
		Iterator<Integer> iterator1 = value.iterator();
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		//System.out.println(hashTable.elements());
		
	}

}
