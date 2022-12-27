package sowmyaSirQuestions1;
import java.util.Arrays;
//how to copy linkedList to array
import java.util.LinkedList;

public class Collection5 {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add("vaishali");
		linkedList.add(98);
		linkedList.add('i');
		linkedList.add("varun");
		linkedList.add('5');
		linkedList.add("ramcharan");
		System.out.println(linkedList);
	    Object[] arr = linkedList.toArray();
	    System.out.println(Arrays.toString(arr));
	}

}
