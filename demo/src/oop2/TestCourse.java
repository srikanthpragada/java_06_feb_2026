package oop2;

import java.util.Arrays;

class Course implements Comparable<Course> {
	private String title;
	private int fee;

	public Course(String title, int fee) {
		super();
		this.title = title;
		this.fee = fee;
	}

	@Override
	public int compareTo(Course other) {
		 return this.title.compareTo(other.title);
	}
	
	public String toString() {
		return  this.title + "  - " + this.fee;
	}

}

public class TestCourse {

	public static void main(String[] args) {
		Course courses[] = { 
				 new Course("Python", 10000), 
				 new Course("Java", 7500), 
				 new Course("Gen AI", 15000) };

		Arrays.sort(courses);
		
		for(var c : courses) {
			System.out.println(c);
		}

	}

}
