package stringPrograms;

public class StringEndsWithO {
	public static void main(String[] args) {
		String s = "hello who are you what are you doing to do";
		String[] s1 = s.split(" ");
		for(int i=0;i<s1.length;i++) {
			String str=s1[i];
			if(str.charAt(str.length()-1)=='o') {
				System.out.println(str+ " is having o at the ending of the string");
			}
			
		}

	}

	}
