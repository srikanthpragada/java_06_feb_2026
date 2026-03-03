package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {

	public static void main(String[] args) throws Exception {
		var fr = new FileReader("c:\\classroom\\feb6\\test.txt");
		var br = new BufferedReader(fr);

		while (true) {
			var line = br.readLine();

			if (line == null) // EOF
				break;

			System.out.print(line + "\n");
		}

		br.close();
		fr.close();
	}
}
