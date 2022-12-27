package interfaceprograms;

public class Fibbonaci {
	public static void main(String[] args) {
		int a=100;
		int b=101;
		System.out.print(a+ ",");
		System.out.print(b+ ",");
		for(int i=1;i<=9;i++) {
			int sum=a+b;
			System.out.print(sum+ ",");
			a=b;
			b=sum;
		}
	}

}
