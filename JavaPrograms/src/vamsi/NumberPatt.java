package vamsi;

public class NumberPatt {
	public static void main(String[] args) {
		int num=0;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				num++;
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}

}