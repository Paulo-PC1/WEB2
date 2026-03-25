package br.edu.ifspcjo.ads.web2.checkout.model;

public class Buy implements Authorizable, Printable {

	private String clientName;
	private double total;
	private String product;

	public Buy(String clientName, double total, String product) {
		super();
		this.clientName = clientName;
		this.total = total;
		this.product = product;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	@Override
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	@Override
	public String getPageHeader() {
		return product + " = R$ " + total;

	}

	@Override
	public String getPageBody() {
		return clientName;
	}

}
