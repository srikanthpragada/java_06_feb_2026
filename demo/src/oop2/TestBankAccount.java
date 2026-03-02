package oop2;

class InvalidAmountException extends Exception {
	public InvalidAmountException(double amount) {
		super(String.format("Transaction amount %lf is invalid!", amount));
	}
	
//	@Override 
//	public String getMessage() {
//		return "";
//	}
}

interface BankTransactions {
	int minBalance = 10000;
	
	static int getMinBalance() {
		return minBalance;
	}
	
	void deposit(double amount) throws InvalidAmountException;
	void withdraw(double amount)throws InvalidAmountException;
	double getBalance();
	
	default double getTransactionFee(double amount) {
		return  amount * 0.05;
	}
}

class SavingsAccount implements BankTransactions {

	@Override
	public void deposit(double amount) throws InvalidAmountException{
		 
		if (amount <= 0)
			throw new InvalidAmountException(amount);
		
	}

	@Override
	public void withdraw(double amount) throws InvalidAmountException {
		if (amount <= 0)
			throw new InvalidAmountException(amount);
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class CurrentAccount implements BankTransactions {

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override 
	public double getTransactionFee(double amount) {
		return  amount * 0.03;
	}
}

public class TestBankAccount {
	public static void main(String[] args) {
		 BankTransactions trans;
		 
		 trans = new SavingsAccount();
		 trans.getTransactionFee(10000);
	}
}
