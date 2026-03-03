package io;

import java.io.FileWriter;
import java.util.Scanner;

public class WriteNames {

	public static void main(String[] args) throws Exception{
		 
		var fw = new FileWriter("c:\\classroom\\feb6\\names.txt");
		var s = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter name [end to stop] :");
			var name = s.nextLine();
			
			if(name.toLowerCase().equals("end"))
				break;
			
			fw.write(name + "\n");
		}
		fw.close();
	}
}
