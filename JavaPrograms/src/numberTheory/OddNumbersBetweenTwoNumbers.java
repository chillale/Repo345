package numberTheory;

public class OddNumbersBetweenTwoNumbers {
	public static void main(String[] args) {
		int m=10;
		int n=100;
		int count=0;
		for(int i=m;i<=n;i++) {
			if(i%2==1) {
				count++;
			}
		}
		System.out.println("The odd numbers between "+m+" and "+n+" are "+count);
	}

}
