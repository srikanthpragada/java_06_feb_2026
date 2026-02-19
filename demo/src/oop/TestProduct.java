package oop;

class Product {
	private String name;
	protected int price;

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

class DiscountProduct extends Product {
	private int disRate;

	public DiscountProduct(String name, int price, int disRate) {
		super(name, price); // Call superclass constructor
		this.disRate = disRate;
	}

	@Override
	public int getPrice() {
		return this.price - (this.price * this.disRate / 100);
	}
}

public class TestProduct {

	public static void main(String[] args) {
		var p = new Product("Bose Headphones", 30000);
		System.out.println(p.getPrice());

		var dp = new DiscountProduct("Logitech Mouse", 15000, 10);
		System.out.println(dp.getPrice());
		
		Product prod; 
		
		prod = new Product("Something", 10000);
		prod = new DiscountProduct("Other product", 20000, 10);  // Upcasting 
		
		DiscountProduct disprod;
		
		if (prod instanceof DiscountProduct)
			disprod = (DiscountProduct) prod;   // Downcasting

		// Check and convert 
		if (prod instanceof DiscountProduct dp2) {
			
		}
	}
}
