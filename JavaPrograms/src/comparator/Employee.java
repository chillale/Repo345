package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable{
	String playerName;
	int age;
	int salary;
	public Employee(String playerName, int age, int salary) {
		this.playerName = playerName;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public int compareTo(Object o) {
		Employee employee =(Employee)o;
		if(salary>employee.salary) {
			return 1;
		}
		else if(salary<employee.salary) {
			return -1;
		}
		
		return 0;
	}
	
	
	@Override
	public String toString() {
		return "playerName=" + playerName + ", age=" + age + ", salary=" + salary;
	}
	public static void main(String[] args) {
		Employee employee = new Employee("Hardik", 32, 20000);
		Employee employee1 = new Employee("Virak", 34, 30000);
		Employee employee2 = new Employee("Dhoni", 42, 50000);
		Employee employee3 = new Employee("RishabhPant", 36, 60000);
		Employee employee4 = new Employee("DineshKarthik", 22, 10000);
		
		ArrayList arrayList = new ArrayList();
		arrayList.add(employee);
		arrayList.add(employee1);
		arrayList.add(employee2);
		arrayList.add(employee3);
		arrayList.add(employee4);
		 Collections.sort(arrayList);
		 System.out.println(arrayList);
		 for(Object list:arrayList) {
			 System.out.println(list);
		 }
		 
		 System.out.println("After sorting with respect to age");
		 Collections.sort(arrayList, new MyAgeComparator());
		 for(Object list:arrayList) {
			 System.out.println(list);
		 }
		 
		 System.out.println("After sorting with respect to Name");
		 
		 Collections.sort(arrayList, new MyNameComparator());
		 for(Object list:arrayList) {
			 System.out.println(list);
		 }
		
		
	}

	

}
