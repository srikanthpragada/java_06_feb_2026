package oop;

class Course {
	private String title;
	private int duration, fee;

	public Course(String title, int duration, int fee) {
		this.title = title;
		this.duration = duration;
		this.fee = fee;
	}
	
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getFee() {
		return this.fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
}

public class TestCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
