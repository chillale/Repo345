package mapInterface;

import java.util.Hashtable;

public class HashTableCla {
	public static void main(String[] args) {
		Hashtable hashTable = new Hashtable();
		hashTable.put("s", 200);
		hashTable.put(2, "varun");
		hashTable.put(44, "varuntej");
		hashTable.put(2, "rajesh");
		hashTable.put(2, "chiranjeevi");//here we are giving the duplicate keys but it
		//will accept duplicate values only it will not the change the key
		hashTable.put("s", 22);
		//hashTable.put(null, null);//it will not accept null value as a key or as a value
		//hashTable.put(1, null);
		System.out.println(hashTable);
		
	}

}
