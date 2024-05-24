
public class InttoPalindrome {
//Done
	public static void main(String args[]) {
//		isPalindrome(120);
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(-121));
	}
	
	public static boolean isPalindrome(int x) {
		
		String str = String.valueOf(x);
		
		char ch[] = str.toCharArray();
		String rev = "";
		for (int i = str.length()-1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		
		if(str.equals(rev)) {
			return true;
		}
		return false;
	}
}
