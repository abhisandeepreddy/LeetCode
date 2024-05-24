import java.util.Stack;
//Done
public class BackSpaceString {
	public static void main(String args[]) {

		Space sp = new Space();
		System.out.println(sp.backspaceCompare("xywrrmp", "xywrrm#p"));
	}
}

class Space {
	public boolean backspaceCompare(String s, String t) {

		Stack<Character> str1 = new Stack<Character>();
		Stack<Character> str2 = new Stack<Character>();
		
		for(int i = 0; i < s.length(); i++) {
			
			if((s.charAt(i) >= 65 && s.charAt(i) <= 90) || (s.charAt(i) >= 97 && s.charAt(i) <= 122)) {
				str1.push(s.charAt(i));
			}
			else if(!(str1.isEmpty()))
				str1.pop();
		}
		for(int i = 0; i < t.length(); i++) {
			
			if((t.charAt(i) >= 65 && t.charAt(i) <= 90) || (t.charAt(i) >= 97 && t.charAt(i) <= 122)) {
				str2.push(t.charAt(i));
			}
			else if(!(str2.isEmpty()))
				str2.pop();
		}
		
		if(str1.empty() && str2.empty())
			return true;
		else if(str1.size() != str2.size())
			return false;
		else {
			
			String first = "", second = "";
			
			while(!(str1.isEmpty())) {
				first = first + str1.pop();
				second = second + str2.pop();
			}
			
			if(first.equals(second))
				return true;
			else
				return false;
		}
		
	}
}