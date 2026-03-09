package advanced;

import java.util.regex.Pattern;

public class REDemo {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[0-9 ]+");
		String[] items = p.split("one99 two4three799 four 1five");
		for (String s : items)
			System.out.println(s);
	}
}
