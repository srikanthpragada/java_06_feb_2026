package lib1;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return this.name + " - " + this.age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person other) {
			return this.name.equals(other.name) && this.age == other.age;
		} else
			return false;
	}
	// When two objects are equal then their hashcodes must be same 
	@Override
	public int hashCode() {
		return this.age;
	}
}

public class TestPerson {
	public static void main(String[] args) {
		var p1 = new Person("Martin", 30);
		var p2 = new Person("Martin", 30);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1.toString());
		System.out.println(p1.equals(p2));

		System.out.println(p1.equals("Abc"));
	}
}
