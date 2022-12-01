package examPrograms;

public class Patter {
	public static void main(String[] args) {
		//String s="523";
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=3;j++) {
				if((j==1)||(i+j==4)||(i==j)||(i+j==3)||(i==2&&j==3)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
		System.out.println();
	}
	}

}
