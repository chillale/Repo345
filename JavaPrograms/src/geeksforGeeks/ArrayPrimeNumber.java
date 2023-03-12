package geeksforGeeks;

public class ArrayPrimeNumber {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int primeCount=0;
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					count++;
				}
			}
			if(count==2) 
			{
				primeCount++;
			}
		}
		System.out.println("The number of prime numbers in an array "+primeCount);
	}

}
