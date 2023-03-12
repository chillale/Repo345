package greatLearning;
//2x+3y+5z=99;
//how many combinations is there with this equation in a loop
public class EquationProgram {
	public static int equation(int n) {
		int count=0;
		for(int x=0;x<n;x++) {
			
			for(int y=0;y<n;y++) {
				for(int z=0;z<n;z++) {
					if(2 *x+10*y+5*z==67) {
						System.out.println(x+", "+y+", "+z);
						count++;
					}
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(equation(10));
	}

}
