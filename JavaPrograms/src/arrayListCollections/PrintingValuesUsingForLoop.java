package arrayListCollections;

import java.util.ArrayList;

public class PrintingValuesUsingForLoop {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("vaishali");
		a.add(4);
		a.add(12.5);
		a.add('g');
//		for(int i=0;i<a.size();i++) {
//			System.out.println(a.get(i));
//		}
//		//printing in reverse order
//		for(int i=a.size()-1;i>=0;i--) {
//			System.out.print(a.get(i)+ " ");
//		}
		a.trimToSize();
		System.out.println(a);
	
	}

}
