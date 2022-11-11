package stringPrograms;

public class ReversingFirstAndLast {
     public static void main(String[] args) {
		String s="welcome to tyss hyderabad";
		String[] str = s.split(" ");
		for(int i=str.length-1;i>0;i--) {
			String temp=str[0];
			str[0]=str[i];
			str[i]=temp;
			break;
		}
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
	}

}
