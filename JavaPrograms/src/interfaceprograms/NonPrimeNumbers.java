package interfaceprograms;

public class NonPrimeNumbers {
	public static void main(String[] args) {
		int num=257;
		int temp=num;
		int digit1=num%10;
		int sum=0;
		while(temp>0) {
			while(temp>0) {
				int digit=temp%10;
				temp/=10;
				break;
			}
			sum=sum+temp%10;
			temp/=10;
		}
		if(digit1==sum) {
			System.out.println("The sum of first two digits is 3rd digit");
		}
		else {
			System.out.println("The sum of first two digits is not 3rd digit");
		}
	}

}

