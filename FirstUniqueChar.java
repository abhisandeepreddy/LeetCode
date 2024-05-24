
public class FirstUniqueChar {
//Done
	public static void main(String args[]) {

		Unique uni = new Unique();
		System.out.println(uni.firstUniqChar("addaaaassddeffdggfhthhghhgbbtbbvbbdggfbbthh"));
	}
}

class Unique {

	public int firstUniqChar(String s) {
 		
		int flag;
		for (int i = 0; i < s.length(); i++) {
			flag = 0;
						
			for (int j = 0; j < s.length(); j++) {
				char chari = s.charAt(i);
				char charj = s.charAt(j);
				if(chari == charj) {
					flag++;
				}
				if (flag >= 2)
					break;
			}
			if(flag <= 1) {
				System.out.println(s.charAt(i));
				return s.indexOf(s.charAt(i));
			}
		}
		
		return -1;
	}
}