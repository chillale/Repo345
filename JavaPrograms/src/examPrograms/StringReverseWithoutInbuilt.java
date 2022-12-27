package examPrograms;

public class StringReverseWithoutInbuilt {
	public static void main(String[] args) {
		String s = "I am from Banglore";
	              String[] str=s.split(" ");
	              String str1="";
	              for(int i=0;i<str.length;i++) {
	            	  str1=str[i]+" "+str1;
	              }
	              System.out.println(str1);
	}
}
