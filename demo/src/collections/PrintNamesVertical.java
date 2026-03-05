package collections;

import java.nio.file.Files;
import java.nio.file.Path;

public class PrintNamesVertical {
	public static void main(String[] args) throws Exception {
		var path = Path.of("c:\\classroom\\feb6\\customers.txt");
		var lines = Files.readAllLines(path);
	
		for (var line : lines)
			for (var name : line.split(","))
				System.out.println(name);
	}
}
