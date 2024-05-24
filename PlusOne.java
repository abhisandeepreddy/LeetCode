import java.util.ArrayList;
import java.util.Stack;

public class PlusOne {
//Done
	public static void main(String args[]) {

		// 7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 9
		Plus plus = new Plus();
		int[] digits = new int[] {  2,4,9,3,9 };
		int[] output = plus.plusOne(digits);
		for (int i : output) {
			System.out.println(i);
		}

	}
}

class Plus {

	public int[] plusOne(int[] digits) {
		
		if(digits[digits.length - 1] == 9) {
			
			Stack<Integer> arr = new Stack<Integer>();
			int flag = 0;
			for(int i = digits.length-1; i >= 0; i--) {
				if(!(arr.empty())) {
					if(digits[i] == 9 && flag == 0) {
						arr.pop();
						arr.push(0);
						arr.push(1);
					}
					else if( flag == 1)
						arr.push(digits[i]);
					else {
						arr.push(digits[i] + arr.pop());
						flag = 1;
					}
					
				}
				else {
					if(digits[i] == 9) {
						arr.push(0);
						arr.push(1);
					}
				}
			}
			int[] output = new int[arr.size()];
			
			for(int i = 0; i < output.length; i++) {
				output[i] = arr.pop();
			}
			
			return output;
		}
		else {
			int result = digits[digits.length - 1] + 1;
			digits[digits.length - 1] = result;
			return digits;
		}
		
		
	}
}
