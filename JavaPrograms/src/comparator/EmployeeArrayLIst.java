package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeArrayLIst implements Comparable{
	String name;
	int age;
	int salary;
	
	public EmployeeArrayLIst(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public int compareTo(Object o) {
		EmployeeArrayLIst employeeArrayList = (EmployeeArrayLIst)o;
		if(salary>employeeArrayList.salary) {
			return 1;
		}
		else if(salary<employeeArrayList.salary) {
			return -1;
		}
		return 0;
	}
	

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", salary=" + salary;
	}
	public static void main(String[] args) {
		EmployeeArrayLIst employee = new EmployeeArrayLIst("sravan", 22, 30000);
		EmployeeArrayLIst employee1 = new EmployeeArrayLIst("anusuya", 29, 10000);
		EmployeeArrayLIst employee2 = new EmployeeArrayLIst("narayana", 25, 40000);
		EmployeeArrayLIst employee3 = new EmployeeArrayLIst("tarun", 55, 20000);
		EmployeeArrayLIst employee4 = new EmployeeArrayLIst("satyavati", 33, 70000);
		
		ArrayList arrayList = new ArrayList();
		arrayList.add(employee);
		arrayList.add(employee1);
		arrayList.add(employee2);
		arrayList.add(employee3);
		arrayList.add(employee4);
		
		System.out.println(arrayList);
		Collections.sort(arrayList);
		System.out.println(arrayList);
		for(Object list:arrayList) {
			System.out.println(list);
		}
		
	
	}


	

	

}
