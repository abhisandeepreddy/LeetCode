import java.util.*;

public class RomanToInteger {
//Done
	public static void main(String args[]) {
		tets t = new tets();
		System.out.println(t.romanToInt("MCMXCIV"));
	}
}

class tets {
	public int romanToInt(String s) {

		int sum = 0;
		Map<Character, Integer> roman = new HashMap<Character, Integer>();
		roman.put('I', 1);
		roman.put('V', 5);
		roman.put('X', 10);
		roman.put('L', 50);
		roman.put('C', 100);
		roman.put('D', 500);
		roman.put('M', 1000);

		
		for (int i = s.length()-1; i >= 0; i--) {

			Character ch = s.charAt(i);
			int romanInteger = roman.get(ch);
			
			if (i < s.length()-1) {
				if (romanInteger < roman.get(s.charAt(i + 1))) {
					sum = sum - romanInteger;
				}
				else
					sum = sum + romanInteger;
			}
			else
				sum = sum + romanInteger;
		}

		return sum;
	}
}