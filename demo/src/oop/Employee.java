package oop;

public class Employee {
	// Instance Variables 
	private String name;
	private int salary;

	// Constructor 
	public Employee(String n, int sal) {
		name = n;
		salary = sal;
	}
	
    // Methods
	public void print() {
		System.out.println(name);
		System.out.println(salary);
	}

	public void setSalary(int sal) {
		salary = sal;
	}

	public int getSalary() {
		return salary;
	}
}
