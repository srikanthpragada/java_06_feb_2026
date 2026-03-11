package advanced;

import java.nio.file.Files;
import java.nio.file.Path;

public class PrintLongNames {

	public static void main(String[] args) throws Exception {
		var path = Path.of("c:\\classroom\\feb6\\names.txt");
		
		var avg = 
			 Files.lines(path)
		     .mapToInt(l -> l.length())
		     .average()
		     .getAsDouble();
		
		System.out.println(avg);
		
		Files.lines(path)
		  .filter(l ->  l.length() > avg)
		  .forEach(System.out::println);
		
	}

}
