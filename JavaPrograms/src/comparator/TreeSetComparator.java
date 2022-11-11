package comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Integer integer = (Integer)o1;
		Integer integer1 = (Integer)o2;
		if(integer<integer1) {
			return 1;
		}
		if(integer>integer1) {
			return -1;
		}
		return 0;
	}
	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet(new TreeSetComparator());
		treeSet.add(22);
		treeSet.add(12);
		treeSet.add(34);
		treeSet.add(87);
		treeSet.add(35);
		
		System.out.println(treeSet);
	}

	

}
