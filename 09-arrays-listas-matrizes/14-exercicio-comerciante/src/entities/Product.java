package entities;

public class Product {
	private String name;
	private double purchasePrice;
	private double salePrice;

	public Product(String name, double purchasePrice, double salePrice) {
		this.name = name;
		this.purchasePrice = purchasePrice;
		this.salePrice = salePrice;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPurchasePrice() {
		return purchasePrice;
	}
	
	public double getSellPrice() {
		return salePrice;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	
	public void setSellPrice(double salePrice) {
		this.salePrice = salePrice;
	}
	
	public double profit() {
		return salePrice - purchasePrice;
	}
	
	public double profitMargin() {
		return profit() / salePrice * 100;
	}
}
