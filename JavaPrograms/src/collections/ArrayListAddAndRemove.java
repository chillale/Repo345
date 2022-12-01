package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAddAndRemove {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("sravan");
		arrayList.add("tarun");
		arrayList.add("anusuya");
		arrayList.add("narayana");
		arrayList.add("manju");
		arrayList.add("sravan");
		System.out.println(arrayList);
		Collections.sort(arrayList);
		System.out.println(arrayList);
		System.out.println(arrayList.remove(3));
		System.out.println(arrayList);
		arrayList.remove("sravan");
		System.out.println(arrayList);
		ArrayList<String> arrayList2=new ArrayList(arrayList);
		System.out.println(arrayList2);
		arrayList2.add("sravan");
		System.out.println(arrayList2);
		arrayList2.addAll(arrayList);
		System.out.println(arrayList2);
		System.out.println(arrayList.contains("sravan"));
		System.out.println(arrayList2.equals(arrayList));
		
	}

}
