package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValuesStrock() {
		return quantity * price;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void romoveProducts(int quantity) {
		this.quantity -= quantity;
	}

}
