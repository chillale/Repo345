package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableInterfa implements Comparable{
	int age;
	String name;
	public ComparableInterfa(int age, String name) {
		this.age = age;
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {
		ComparableInterfa comparatorInterfa4 =(ComparableInterfa)o;
		if(name.compareTo(comparatorInterfa4.name)>0) {
			return 1;
		}
		else if(name.compareTo(comparatorInterfa4.name)<0) {
			return -1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "age=" + age + ", name=" + name;
	}
	public static void main(String[] args) {
		ComparableInterfa comparatorInterfa = new ComparableInterfa(17, "sravan");
		ComparableInterfa comparatorInterfa1 = new ComparableInterfa(21, "manjulatha");
		ComparableInterfa comparatorInterfa2 = new ComparableInterfa(33, "thraun");
		ComparableInterfa comparatorInterfa3 = new ComparableInterfa(34, "rajnalla");
		 
		
		ArrayList arrayList= new ArrayList<>();
		arrayList.add(comparatorInterfa);
		arrayList.add(comparatorInterfa1);
		arrayList.add(comparatorInterfa2);
		arrayList.add(comparatorInterfa3);
		
		Collections.sort(arrayList);
		System.out.println(arrayList);
		for(Object list:arrayList) {
			System.out.println(list);
		}
	}

	

}
