package BEAN;

public class Cart {
	private Product product;
	private int quantity;
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Cart(Product product) {
		this.product = product;
		this.quantity = 1;
	}


	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
