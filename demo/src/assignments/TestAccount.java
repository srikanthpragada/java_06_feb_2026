package assignments;

class SavingsAccount {
	// Instance Variables
	private int acno;
	private String customer;
	private double balance;

	// Static variable or class variable
	private static double minBalance = 10000;

	public SavingsAccount(int acno, String customer) {
		this.acno = acno;
		this.customer = customer;
	}

	public SavingsAccount(int acno, String customer, double balance) {
		this(acno, customer); // calling another constructor
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.balance -= amount;
	}

	public double getBalance() {
		return this.balance;
	}

}

public class TestAccount {

	public static void main(String[] args) {
		var a1 = new SavingsAccount(1, "Bill");
		var a2 = new SavingsAccount(2, "Scott", 10000);

		a1.deposit(10000);
		System.out.println(a1.getBalance());

		a2.withdraw(2000);
		System.out.println(a2.getBalance());

	}

}
