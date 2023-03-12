package vamsi;

public class Pattern1 {
	public static void main(String[] args) {
		int num=0;
		int space=4;
		for(int i=1;i<=9;i++) {
			if(i<=5) {
				space--;
				num++;
			}
			else {
				space++;
				num--;
			}
		
			for(int k=1;k<=num;k++) {
				System.out.print(num+" ");
			}
			
			for(int j=1;j<=space;j++) {
			System.out.print(" ");
			}
		System.out.println();
		}
		
	}

}
