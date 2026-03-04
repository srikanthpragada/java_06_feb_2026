package io;

import java.nio.file.Files;
import java.nio.file.Path;

public class CopyFile {
	public static void main(String[] args) throws Exception {
		var sourcePath = Path.of("c:\\classroom\\feb6\\customers.txt");
		var targetPath = Path.of("c:\\classroom\\feb6\\upper_customers.txt");

		var contents = Files.readString(sourcePath);
		Files.writeString(targetPath, contents.toUpperCase());
	}
}
