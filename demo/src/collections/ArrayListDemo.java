package collections;
import java.util.ArrayList;
public class ArrayListDemo {
	public static void main(String[] args) {
		var al = new ArrayList<String>();
		
		al.add("Java");
		al.add("Python");
	
		System.out.println(al.contains("Java"));
		System.out.println(al.indexOf("JavaScript"));
		
		al.remove("Java");
		
		System.out.println(al.size());
	}

}
