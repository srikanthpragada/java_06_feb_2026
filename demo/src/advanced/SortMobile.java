package advanced;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class SortMobile {
	public static void main(String[] args) throws Exception {
		 var path = Path.of("c:\\classroom\\feb6\\phones.txt");
		 var contents = Files.readString(path);
		 
		 var pattern = Pattern.compile("\\d{10}");
		 var matcher = pattern.matcher(contents);

		 var mobiles  = new TreeSet<String>();
		 
		 while(matcher.find()) {
			 mobiles.add(matcher.group());
		 }
		 
		 for(var mobile : mobiles)
			 System.out.println(mobile);
	}
}
