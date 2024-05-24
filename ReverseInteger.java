
public class ReverseInteger {
//Need to work on it
	public static void main(String args[]) {

		IntegerReverse intr = new IntegerReverse();
		System.out.println(intr.reverse(1534236469));//321
	}
}

class IntegerReverse {
	public int reverse(int x) {
		
		 int reverse = 0, flag = 0;
		 if(x < 0) {
			 flag = 1;
			 x = x * -1;
		 }
		while(x > 0) {
			int num = x % 10;
			if(num > 0 || reverse > 0)
				reverse = (reverse * 10) + num ;
			x = x / 10;
		}	
		
		if(flag == 1)
			return -reverse;
		else
			return reverse;
	}
}