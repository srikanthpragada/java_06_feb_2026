package io;

import java.io.RandomAccessFile;

public class WriteMarks {
	public static void main(String[] args) throws Exception {
		try (var rf = new RandomAccessFile("c:\\classroom\\feb6\\marks.dat", "rw")) {
			for (int i = 1; i <= 50; i++)
				rf.writeByte((int) (Math.random() * 100));
		}

	}

}
