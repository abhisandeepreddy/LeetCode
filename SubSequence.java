
public class SubSequence {
//Done (Is SubSequence)
	public static void main(String args[]) {
		
		Sequence seq = new Sequence();
		System.out.println(seq.isSubsequence("leeeeetcode", "slsesesesesesesestscsosdsel"));
		
		}
}

class Sequence {

	public boolean isSubsequence(String s, String t) {
		
		int flag = 0, index = -1;
		for (int i = 0 ; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
			for (int j = index + 1; j < t.length(); j++) {
				
				if (ch == t.charAt(j)) {
					flag++;
					index = j;
					break;
				}
			}
			
			
		}
		if (flag >= s.length()) {
			return true;
		}
		return false;
	}

}
