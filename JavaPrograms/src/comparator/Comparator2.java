package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator2 implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Integer integer = (Integer)o1;
		Integer integer1 = (Integer)02;
		if(integer>integer1) {
			return 1;
		}
		else if(integer<integer1) {
			return -1;
		}
		return 0;
	}

	
	public static void main(String[] args) {
		ArrayList <Integer> arrayList = new ArrayList();
		arrayList.add(2);
		arrayList.add(33);
		arrayList.add(22);
		arrayList.add(17);
		arrayList.add(9);
		System.out.println(arrayList);
		 
		Comparator2 c2 = new Comparator2();
		
		Collections.sort(arrayList, c2);
		System.out.println(arrayList);
	}

	
}
