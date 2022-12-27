package sowmyaSirQuestions1;

import java.util.ArrayList;
import java.util.Arrays;

//how to copy arraylist to array
class Collection2 {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add("vaishali");
		arrayList.add(89);
		arrayList.add(899);
		arrayList.add("vishnu");
		arrayList.add(34);
		arrayList.add('d');
		System.out.println(arrayList);
		Object[] arr = arrayList.toArray();
		System.out.println(Arrays.toString(arr));

	}

}
