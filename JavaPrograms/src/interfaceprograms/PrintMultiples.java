package interfaceprograms;

public class PrintMultiples {

	public static void main(String[] args) {
		int jcount=0;int lcount=0;int j2count=0;
	for(int i=1;i<=100;i++) {
		if(i%4==0) {
			jcount++;
			//System.out.println("java");
		}
		if(i%5==0) {
			j2count++;
			//System.out.println("j2ee");
			
		}
		if(i%4==0&&i%5==0) {
			lcount++;
			//System.out.println("lara");
		}
	}
	System.out.println(jcount +", "+j2count +" ,"+lcount);
	}

}
