package io;

import java.nio.file.Files;
import java.nio.file.Path;

public class PrintNamesVertical {
	public static void main(String[] args) throws Exception {
		var path = Path.of("c:\\classroom\\feb6\\customers.txt");
		System.out.println(path.getClass());
		
		var contents = Files.readString(path);

		var lines = contents.split("\\n");  // get lines 

		for (var line : lines)
			for (var name : line.split(","))
				System.out.println(name);

	}

}
