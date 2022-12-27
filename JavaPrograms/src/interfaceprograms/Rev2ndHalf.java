package interfaceprograms;

public class Rev2ndHalf {

	public static void main(String[] args) {
		int num=123456;
		int sum=0;
		int copynum=num;
		while(num>0) {
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println(sum);
		if(sum%2==0) {
			System.out.println(" number is even ");
		}
		else {
			System.out.println(" number is not even ");
		}
		Integer value=Integer.valueOf(copynum);
		String str=value.toString();
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i==ch.length/2) {
				char temp=ch[i];
				ch[i]=ch[ch.length-1];
				ch[ch.length-1]=temp;
				
			}
		}
		System.out.println(ch);
	}

}
