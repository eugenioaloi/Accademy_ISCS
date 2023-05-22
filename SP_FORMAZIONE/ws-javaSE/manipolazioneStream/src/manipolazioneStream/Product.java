package manipolazioneStream;

public class Product {
	
	int price;
	String desc;
	
	public Product(int price, String desc) {
		this.desc = desc;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [price=" + price + ", desc=" + desc + "]";
	} 

	
	
}
