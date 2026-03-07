package collections;

import java.nio.file.Files;
import java.nio.file.Path;

public class RemoveBlankLines {

	public static void main(String[] args) throws Exception {
		var path = Path.of("c:\\classroom\\feb6\\students.txt");
		var lines = Files.readAllLines(path);

		var fw = Files.newBufferedWriter(path);

		for (var line : lines) {
			if (line.trim().length() > 0) // non-blank line
				fw.write(line + "\n");
		}
		fw.close();
	}
}
