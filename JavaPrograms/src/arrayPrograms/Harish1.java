package arrayPrograms;

public class Harish1 {
	public static void main(String[] args) {
		int a[]= {2,4,5,8,9};
		for(int i=1;i<=10;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(i==a[j]) {
					count++;
					break;
				}
			}
			if(count!=1)
			System.out.println("missing numbers are "+i);
		}
	}

}
