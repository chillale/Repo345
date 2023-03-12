package vamsi;

public class StarPatter {

	public static void main(String[] args) {

		int num=0;
		for(int i=1;i<=10;i++) {
			for(int k=1;k<=num;k++) {
				System.out.print("*");
			}
			if(i<=5) {
				num++;
			}
			else {
				num--;
			}
		System.out.println(" ");
		}
	}
}
