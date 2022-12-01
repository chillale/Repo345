package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListCollections implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		String string=(String)o1;
		String string1=(String)o2;
		if(string.compareTo(string1)>1) {
			return 1;
		}
		else if(string.compareTo(string1)<1) {
			return -1;
		}
		return 0;
	}
	public static void main(String[] args) {
		ArrayList<String> arrayList= new ArrayList<>();
		arrayList.add("sravan");
		arrayList.add("anusuya");
		arrayList.add("narayana");
		arrayList.add("tarun");
		arrayList.add("bharath");
		
		System.out.println(arrayList);
		Collections.sort(arrayList);
		System.out.println(arrayList);
		
	}
	

	

}
