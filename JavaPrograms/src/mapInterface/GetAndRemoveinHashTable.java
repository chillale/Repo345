package mapInterface;

import java.util.Hashtable;

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
		System.out.println(hashTable.elements());
		
	}

}
