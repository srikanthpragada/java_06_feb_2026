package oop2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedUnchecked {

	public static void main(String[] args) throws Exception{

		int n = Integer.parseInt("123");
		
		System.out.println(100 / n);

//		try {
//			var f = new FileReader("abc.txt");
//		}
//		catch (FileNotFoundException ex) {
//
//		}
		
		var f = new FileReader("story.txt");

	}

}
