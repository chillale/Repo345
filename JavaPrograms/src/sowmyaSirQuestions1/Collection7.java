package sowmyaSirQuestions1;

import java.util.Collections;
import java.util.LinkedList;

//how to reverse linkedList content
public class Collection7 {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add("sravan");
		linkedList.add(99);
		linkedList.add('k');
		linkedList.add("vasu");
		linkedList.add('h');
		linkedList.add("vaksk");
		System.out.println(linkedList);
		Collections.reverse(linkedList);
		System.out.println(linkedList);
	}

}
