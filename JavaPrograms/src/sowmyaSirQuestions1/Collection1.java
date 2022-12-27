package sowmyaSirQuestions1;

import java.util.ArrayList;

//how to copy or clone a arraylist
public class Collection1 {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(34);
		arrayList.add("sravan");
		arrayList.add("ramesh");
		arrayList.add(89);
		arrayList.add(87);
		ArrayList arrayList2 = new ArrayList<>(arrayList);
		System.out.println(arrayList);
		System.out.println(arrayList2);

	}

}
