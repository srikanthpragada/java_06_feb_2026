package assignments;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class SortNames {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String [] names = new String[5];
		
		for(int i = 0; i < names.length; i ++) {
			System.out.print("Enter name [end to stop] :");
			var name = s.nextLine();
			names[i] = name;
		}
		
		Arrays.sort(names);
		
		for(var name : names)
			System.out.println(name);
	}
}
