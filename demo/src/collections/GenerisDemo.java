package collections;

import java.util.ArrayList;

public class GenerisDemo {

	public static void main(String[] args) {
		 var al = new ArrayList();
		 
		 al.add("Abc");
		 al.add(10);  // int -> Integer
		 al.add("Xyz");
		 
		 String s = (String) al.get(1);
		 
		 
		 var al2 = new ArrayList<Integer>();
		 al2.add(10);
		 al2.add(1000);
		 
		 int v = al2.get(0);
		 
		 
		 
		 
	}
}
