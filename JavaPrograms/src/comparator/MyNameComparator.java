package comparator;

import java.util.Comparator;

public class MyNameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee employee = (Employee)o1;
		Employee employee1 = (Employee)o2;
		if(employee.playerName.compareTo(employee1.playerName)>0){
			return 1;
		}
		else if(employee.playerName.compareTo(employee1.playerName)<0) {
			return -1;
		}
		return 0;
	}

}
