package linkedList;

import java.util.LinkedList;

public class AddingColection {
	public static void main(String[] args) {
		//here we are making it as generic 
		LinkedList<Integer> a = new LinkedList<>();
		a.add(1);
		a.add(22);
		a.add(33);
		a.add(1);
		a.add(5);
		//here it is not generic
		LinkedList l = new LinkedList<>(a);
        l.add("s");
        System.out.println(l);
	}

}
