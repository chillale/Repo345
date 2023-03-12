package patternsprograms;

public class Pattern2 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			int space=4;
			for(int j=1;j<=i;j++) {
				if(j%2==1) {
					System.out.print("1");
				}else {
					System.out.print("0");
				}
			}
			for(int k=1;k<=space;k++) {System.out.print(" ");}
			System.out.println();
		}
	}

}
