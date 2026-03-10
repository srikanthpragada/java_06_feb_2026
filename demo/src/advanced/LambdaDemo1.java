package advanced;

import java.util.Arrays;
import java.util.Comparator;

class LengthCompare implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}

public class LambdaDemo1 {
	
	public static int stringCompare(String s1, String s2) {
		return s1.length() - s2.length();
	}
	
	public static void main(String[] args) {
		String names[] = { "Java", "c", "Cobol", "Python", "JavaScript", "SQL" };

		// Implementing Interface with class 
		Arrays.sort(names, new LengthCompare());
		
		Comparator<String> c = (s1, s2) -> s1.length() - s2.length();
		System.out.println(c.getClass());
		
		//Lambda Expression - sort by length 
		Arrays.sort(names, 
				(s1, s2) -> s1.length() - s2.length());
		for (var v : names)
			System.out.println(v);

		//Lambda Block - sort by ignoring case 
		Arrays.sort(names, 
				(s1, s2) -> {
					var ls1 = s1.toLowerCase();
					var ls2 = s2.toLowerCase();
					return ls1.compareTo(ls2);
				});
		
		for (var v : names)
			System.out.println(v);
		
		//Method Reference - abstract int compare(String, String)
		Arrays.sort(names, LambdaDemo1::stringCompare);
	}
}
