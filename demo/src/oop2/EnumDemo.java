package oop2;

enum PaymentMode  {
	CASH, UPI, CARD
}

public class EnumDemo {

	public static void main(String[] args) {
		 PaymentMode payMode;
		 
		 payMode = PaymentMode.CASH;
		 
		 if(payMode == PaymentMode.CASH)
			 System.out.println("Payment by Cash");
		 
		 
		 
		 
		 
	}

}
