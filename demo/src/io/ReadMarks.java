package io;

import java.io.RandomAccessFile;

public class ReadMarks {
	public static void main(String[] args) throws Exception {
		try (var rf = new RandomAccessFile("c:\\classroom\\feb6\\marks.dat", "r")) {
			for (int i = 1; i <= 50; i++)
				System.out.println(rf.readByte());
		}
	}
}
