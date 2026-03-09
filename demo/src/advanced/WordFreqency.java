package advanced;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class WordFreqency {

	public static void main(String[] args) throws Exception {
		 var path = Path.of("c:\\classroom\\feb6\\story.txt");
		 var contents = Files.readString(path);
		 
		 var pattern = Pattern.compile("\\W+");
		 var words = pattern.split(contents);
		 
		 //System.out.println(words.length);
		 
		 var wordFreq  = new TreeMap<String, Integer>();
		 
		 for(var w : words) {
			 if (wordFreq.containsKey(w)) // word is present then increment count
				 wordFreq.put(w,  wordFreq.get(w) + 1);
			 else // new word - put word and count 1 
				 wordFreq.put(w, 1); 
		 }
		 
		 for(var w : wordFreq.keySet())
			 System.out.printf("%-20s  - %2d\n", w, wordFreq.get(w));
	}

}
