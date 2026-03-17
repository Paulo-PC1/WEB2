
public class Product {
	private int code;
	private String name;
	private double price;
	
	public Product(int code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	@Override //sobrescreve
	public String toString() {
		return "Dados do produtos [Código: " + code + " - Nome: " + name +  " - Preço: " + price + "]";
	}
}
