package advanced;

import java.nio.file.Files;
import java.nio.file.Path;

public class SortNames {

	public static void main(String[] args) throws Exception {
		var path = Path.of("c:\\classroom\\feb6\\names.txt");
		
		Files.lines(path)
		     .filter(l -> l.trim().length() > 0)
		     .distinct()
		     .sorted()
		     .limit(3)
		     .forEach(System.out::println);
	}

}
