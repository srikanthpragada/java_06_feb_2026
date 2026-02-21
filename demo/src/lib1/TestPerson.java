package lib1;

class Person {
	private String name;
	private int age;

}

public class TestPerson {
	public static void main(String[] args) {
		var p = new Person();
		System.out.println(p.hashCode());
		System.out.println(p.toString());
	}

}
