import java.util.Stack;

public class AddBinary {

	public static void main(String args[]) {

		Binary bin = new Binary();
		System.out.println(bin.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
	}
}

class Binary {
//Need to work on it
	public String addBinary(String a, String b) {
		
		int aLen = a.length();
		int bLen = b.length();
		if(aLen > 40 || bLen > 40) {
			String part1 = addBinarytwoparts(a.substring(0, aLen/2),b.substring(0, bLen/2));
			String part2 = addBinarytwoparts(a.substring(aLen/2, aLen),b.substring(bLen/2, bLen));
			return part1+part2;
		}
		else {
			String result = addBinarytwoparts(a, b);
			return result;
		}
	}
	
	public String addBinarytwoparts(String a, String b) {
		long avalue = 0, bvalue = 0, bVal = 1;
		int i = a.length()-1 ;
		while(i >= 0) {
			if(a.charAt(i) == '1')			
				avalue = avalue + bVal;
			bVal = bVal * 2;
			i--;
		}
		i = b.length()-1;
		bVal = 1;
		while(i >= 0) {
			if(b.charAt(i) == '1')			
				bvalue = bvalue + bVal;
			bVal = bVal * 2;
			i--;
		}

		long result = avalue + bvalue;
		if(result <= 0)
			return "0";
		i = 0;
		bVal = 1;
		String output = "";
		Stack<Long> s = new Stack<Long>();
		while(result > 0) {
			long reminder = result % 2;
			s.push(reminder);
			result = result / 2;
		}
		while(!(s.isEmpty())) {
			output = output + s.pop();
		}
		
		return output;

	}
	
}
