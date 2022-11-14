package mapInterface;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

public class LinkedHasMap implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		  String string = (String)o1;
		  String string1 = (String)o2;
		if(string.compareTo(string1)>0) {
			return 1;
		}
		else if(string.compareTo(string1)<0) {
			return -1;
		}
		return 0;
	}


	public static void main(String[] args) {
		TreeMap<String , Integer> treeMap = new TreeMap<>(new LinkedHasMap());
		treeMap.put("sravan", 27);
		treeMap.put("narayana", 46);
		treeMap.put("tarun", 33);
		treeMap.put("manju", 88);
		treeMap.put("sravan", 77);
		treeMap.put("bhavani", 11);
		treeMap.put(null, null);
		
		System.out.println(treeMap);
		
		
		
	}

	
	
}
