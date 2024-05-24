import java.util.LinkedHashSet;

public class MaxLengthBetweenEqualCharacters {
//Need to work on it
	public static void main(String args[]) {
		EqualCharacters e = new EqualCharacters();
		System.out.println(e.maxLengthBetweenEqualCharacters("cabbac"));
	}
}

class EqualCharacters {

	public int maxLengthBetweenEqualCharacters(String s) {

		String[] strArray = s.split("");
    	LinkedHashSet<String> maxlength = new LinkedHashSet<String>();
    	int res = 0;
		
		for(String j: strArray) {
			if(maxlength.add(j))
				res++;
			else
				return res-1;
				
		}
		
		return -1;
	}
}