package sowmyaSirQuestions1;
//how to shuffle elements in arraylist
import java.util.ArrayList;
import java.util.Collections;

class Collection3 {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add("shaikh");
		arrayList.add(45);
		arrayList.add('d');
		arrayList.add("palermo");
		arrayList.add('l');
		System.out.println(arrayList);
		Collections.shuffle(arrayList);
		System.out.println(arrayList);
		
		

	}

}
