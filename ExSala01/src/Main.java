public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "banana");
		System.out.println(product);
		product.setName("Cacho de Bananas");
		product.setPrice(12.99);
		
		System.out.println(product);
		
	}

}
