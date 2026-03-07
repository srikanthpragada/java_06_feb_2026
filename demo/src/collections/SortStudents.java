package collections;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;

public class SortStudents {

	public static void main(String[] args) throws Exception {
		var path = Path.of("c:\\classroom\\feb6\\students.txt");
		var lines = Files.readAllLines(path);

		// remove heading line
		lines.remove(0);

		var students = new TreeMap<Integer, String>();

		for (var line : lines) {
			var parts = line.split(",");
			if (parts.length < 2)
				continue;  // ignore line if it doesn't contains two entries
			
			students.put(Integer.parseInt(parts[0]), parts[1]);
		}

		for (var rollno : students.keySet())
			System.out.printf("%2d %s\n", rollno, students.get(rollno));
	}

}
