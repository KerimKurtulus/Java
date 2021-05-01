
public class Product {
	public Product() {
		
		System.out.println("sa");

	}

	public Product(int id, String name, String shortDescription, double unitPrice) {
		this();
		this.id = id;
		this.name = name;
		this.shortDescription = shortDescription;
		this.unitPrice = unitPrice;
	}

	int id;
	String name;
	String shortDescription;
	double unitPrice;
}
