package io;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class FindMarks {
	public static void main(String[] args) throws Exception {
		try (var rf = new RandomAccessFile("c:\\classroom\\feb6\\marks.dat", "r"); var s = new Scanner(System.in)) {
			while (true) {
				System.out.print("Enter rollno [1-50] and 0 to stop :");
				int rollno = s.nextInt();
				if (rollno == 0)
					break;
				if (rollno < 1 || rollno > 50) {
					System.out.println("Sorry! Invalid Rollno!");
				} else {
					rf.seek(rollno - 1);
					System.out.println(rf.readByte());
				}
			} // while
		}
	}
}
