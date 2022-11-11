package stringPrograms;


public class SwappingCharactersss {
	public static void main(String[] args) {
		String s = "z%#d#b%#a";
		char[] ch=s.toCharArray();
		int left=0;
		int right=ch.length-1;
		for(int i=0;i<ch.length;i++) {

			if(ch[left]>='a'&&ch[left]<='z') {
				if(ch[right]>='a'&&ch[right]<='z') {
					if(left<right) {
						char ch1=ch[left];
						ch[left]=ch[right];
						ch[right]=ch1;
						left++;
						right--;
					}
				}
				right--;		
			}
			else {
				left++;
			}
		}
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}

	}

}
