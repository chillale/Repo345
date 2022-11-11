package mapInterface;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapCla implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Integer i = (Integer)o1;
		Integer i1 = (Integer)o2;
		if(i<i1) {
			return 1;
		}
		else if(i>i1) {
			return -1;
		}
		
		return 0;
	}

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap =new TreeMap<>(new TreeMapCla());
		treeMap.put(12, "vajram");
		treeMap.put(33, "sravan");
		treeMap.put(24, "narayana");
		treeMap.put(85, "tarun");
		treeMap.put(88, "vishnu");
		treeMap.put(44, null);
		
//		System.out.println(treeMap.lastKey());
//		System.out.println(treeMap.firstKey());
//		System.out.println(treeMap.lastEntry());
//		System.out.println(treeMap.firstEntry());
//		System.out.println(treeMap.headMap(88));
//		System.out.println(treeMap.tailMap(12));
//		System.out.println(treeMap.descendingKeySet());
//		System.out.println(treeMap.descendingMap());
		System.out.println(treeMap);
		
	}

	
}
