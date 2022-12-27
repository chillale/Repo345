package interfaceprograms;

public class PrimeNumberDescendingOrder {
	public static void main(String[] args) {
		int primeCount=0;
		for(int i=30;i<=320;i++) {
			int count=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					count++;
				}
			}
			int digit=i%10;
			
			if(primeCount<=30&&count==0&&digit<=5) {
				System.out.print(i+ " ,");
				primeCount++;
			}
		}
		System.out.println(primeCount);
	}

}
