package sowmyaSirQuestions1;

import java.util.LinkedList;

//how to get sublist from linkedlist
public class Collection6 {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add("vaishali");
		linkedList.add(99);
		linkedList.add('j');
		linkedList.add(45);
		linkedList.add("finland");
		linkedList.add(44);
		System.out.println(linkedList);
		System.out.println(linkedList.subList(1, 3));
		
	}

}
