package stackCollection;

import java.util.Stack;

public class StackCollection {
	public static void main(String[] args) {
		Stack s = new Stack<>();
		s.add('s');
		s.push('e');
		s.add('w');
		s.add("sravan");//it will allow duplicates
		s.add(1, 'i');
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		
	}

}
