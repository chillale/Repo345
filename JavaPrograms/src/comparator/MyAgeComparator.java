package comparator;

import java.util.Comparator;

public class MyAgeComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee employee = (Employee)o1;
		Employee employee1 = (Employee)o2;
		if(employee.age>employee1.age) {
			return 1;
		}
		else if(employee.age<employee1.age) {
			return -1;
		}
		return 0;
	}
	

}
