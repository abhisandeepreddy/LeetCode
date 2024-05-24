import java.util.Stack;

public class ValidParentheses {
//Done
	public static void main(String args[]) {

		Parenthese par = new Parenthese();
		boolean result = par.isValid("(])");
		System.out.println(result);
		
	}
}

class Parenthese {
	public boolean isValid(String s) {

		Stack<Character> valid = new Stack<Character>();
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch == '(' || ch == '[' || ch == '{')
				valid.push(ch);
			else if(valid.empty())
				return false;
			else if(ch == ')' && valid.peek() == '(')
				valid.pop();
			else if(ch == '}' && valid.peek() == '{')
				valid.pop();
			else if(ch == ']' && valid.peek() == '[')
				valid.pop();
			else
				valid.push(ch);
		
		}
		
		return valid.empty();
		
	}
}