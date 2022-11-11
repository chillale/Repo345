package mapInterface;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableCla1 {
	public static void main(String[] args) {
		Hashtable<String, Integer> hashTable = new Hashtable<>();
	    hashTable.put("sravan", 33);
	    hashTable.put("tarun", 44);
	    hashTable.put("narayana", 33);
	    hashTable.put("narayana", 55);
	    hashTable.put("anusuya", 46);
	    hashTable.put("tarun", 66);
	    System.out.println(hashTable);
	    //here we are assigning the values of hashtable to another map
	    Hashtable<String, Integer> hashTable1 = new Hashtable<>(hashTable);
	    //hashTable1.putAll(hashTable);//here we are assigning the values of hashtable to another map
	    System.out.println(hashTable1);
	    
	    System.out.println("here we are printing values");
	    Collection<Integer> valuesHashTable1 = hashTable1.values();
	    
	    for(Integer values:valuesHashTable1)
	    	System.out.println(values);
	    
	    System.out.println("here we are printing keys");
	    Set<String> keysSet = hashTable1.keySet();
	    
	    for(String key:keysSet) {
	    	System.out.println(key);
	    }
	    
	    System.out.println("here we are printing entries");
	    Set<Entry<String, Integer>> entrySet = hashTable1.entrySet();
	    
	    for(Entry<String, Integer> singleEntrySet:entrySet) {
	    	System.out.println(singleEntrySet);
	    }
	    
	   System.out.println(hashTable1.containsKey("anusuya"));
	   
	   System.out.println(hashTable1.contains(66));
		
	}

}
