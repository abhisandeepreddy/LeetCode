
public class PowerofTwo {
//Done
	public static void main(String args[]) {
		 Two tow = new Two();
		System.out.println(tow.isPowerOfTwo(-16));
	}
}

class Two {

	public boolean isPowerOfTwo(int n) {
		
		if (n == 1 ) {
			return true;
		}
		for (int i = 1; i <= 31; i++) {

			if(Math.pow(2, i) == n) {
				return true;
			}
		}
		
		return false;
	}
}