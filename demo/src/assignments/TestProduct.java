package assignments;

class Product {
	private String name;
	private int price, qoh;

	public Product(String name) {
		this.name = name;
	}

	public Product(String n, int p) {
		name = n;
		price = p;
	}

	public Product(String n, int p, int q) {
		name = n;
		price = p;
		qoh = q;
	}

	public int getPrice() {
		return price;
	}

	public int getQoh() {
		return qoh;
	}

	public void purchase(int qty) {
		qoh += qty;
	}

	public int getValue() {
		return price * qoh;
	}

	public void setPrice(int p) {
		price = p;
	}
}

public class TestProduct {
	public static void main(String[] args) {
		var p1 = new Product("iPhone 17 Pro", 100000);
		

		p1.purchase(5);
		System.out.println(p1.getValue());

		p1.setPrice(90000);
		System.out.println(p1.getValue());
	}
}
