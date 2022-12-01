package arrayPrograms;

public class PrimeNumbers {
	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7,8,9};
		
		for(int i=0;i<a.length;i++) {
			int num=a[i];
			int count=0;
			for(int j=1;j<=num;j++) {
				if(num%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("The prime numbers are "+a[i]);
			}
		}
	}

}
