package lib1;

public class StringDemo {

	public static void main(String[] args) {
		var s = "hello";
		
		s = "Goodbye";
		
		System.out.println(s.charAt(0));
		System.out.println(s.concat(" C++"));
		System.out.println(s.indexOf("bad"));
		
		String words[] = "how do you do".split(" ");
		
		for(var w : words)
			System.out.println(w);
		
		

	}

}
