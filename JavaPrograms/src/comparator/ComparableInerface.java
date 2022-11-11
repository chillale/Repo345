package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableInerface implements Comparable{
	int age;

	public ComparableInerface(int age) {
		this.age =age;
	}
	@Override
	public String toString() {
		return "age=" + age;
	}
	@Override
	public int compareTo(Object o) {
		ComparableInerface comparatorInerface4 = (ComparableInerface)o;
		if(age>comparatorInerface4.age) {
			return 1;
		}
		else if(age<comparatorInerface4.age) {
			return -1;
		}
		return 0;
	}
	public static void main (String[] args) {
		ComparableInerface comparatorInerface = new ComparableInerface(33);
		ComparableInerface comparatorInerface1 = new ComparableInerface(3);
		ComparableInerface comparatorInerface2 = new ComparableInerface(22);
		ComparableInerface comparatorInerface3 = new ComparableInerface(18);
		
		ArrayList arrayList = new ArrayList();
		arrayList.add(comparatorInerface);
		arrayList.add(comparatorInerface1);
		arrayList.add(comparatorInerface2);
		arrayList.add(comparatorInerface3);
		
		Collections.sort(arrayList);
		System.out.println(arrayList);
		
	}
	
	

}
