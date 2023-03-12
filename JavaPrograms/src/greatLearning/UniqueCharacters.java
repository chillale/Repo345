package greatLearning;

import java.util.Arrays;

public class UniqueCharacters {
	public static void main(String[] args) {
		String s="pradeep";
		Arrays.stream(s.split("")).distinct().forEach(System.out::print);
	}

}
