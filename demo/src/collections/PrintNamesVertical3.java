package collections;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeSet;

public class PrintNamesVertical3 {
	public static void main(String[] args) throws Exception {
		var path = Path.of("c:\\classroom\\feb6\\customers.txt");
		var lines = Files.readAllLines(path);

		var names = new TreeSet<String>();
		for (var line : lines)
			for (var name : line.split(",")) {
				names.add(name);
			}

		for (var name : names)
			System.out.println(name);
	}
}
