package geeksforGeeks;

public class TryCatch extends Exception{
	public static void main(String[] args) throws Throwable {
		try {
			int x=10;
			int y=0;
			System.out.println(x/y);
		}
		finally {
			
			throw new TryCatch();
		}
	}

}
