package collections;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class PrintNamesVertical2 {
	public static void main(String[] args) throws Exception {
		var path = Path.of("c:\\classroom\\feb6\\customers.txt");
		var lines = Files.readAllLines(path);
	
		var names = new ArrayList<String>();
		for (var line : lines) 
			for (var name : line.split(",")) {
				if(!names.contains(name))
				    names.add(name);
			}
		
		names.sort(null);
		
		for(var name : names)
			System.out.println(name);
	}
}
