
public class ProductManager {
	public void addToCart(Product product) {
		System.out.println("-- (" + product.name + ") sepete eklenmiştir. --");
	}
	
	public void addToCart(Product[] products) {
		for (Product product : products) {
			this.addToCart(product);
		}
	}
}
