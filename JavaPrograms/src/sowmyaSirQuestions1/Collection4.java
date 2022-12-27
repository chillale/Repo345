package sowmyaSirQuestions1;

import java.util.ArrayList;
import java.util.Collections;

//how to swap two elements in arraylist
public class Collection4 {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add("dkd");
		arrayList.add(98);
		arrayList.add('l');
		arrayList.add(87);
		arrayList.add("vaishali");
		arrayList.add(34);
		System.out.println(arrayList);
		Collections.swap(arrayList, 2, 4);
		System.out.println(arrayList);

}
}
