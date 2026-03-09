package advanced;

import java.util.Arrays;
import java.util.Comparator;

class LengthCompare implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}

public class LambaDemo1 {
	public static void main(String[] args) {
		String names[] = { "Java", "c", "Cobol", "Python", "JavaScript", "SQL" };

		//Arrays.sort(names, new LengthCompare());
		Arrays.sort(names);

		for (var v : names)
			System.out.println(v);
	}
}
