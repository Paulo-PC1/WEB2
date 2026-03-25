package br.edu.ifspcjo.ads.web2.checkout.model;

public class Checkout {
	
	private Operator operator;
	private Printer printer;
	
	public Checkout(Operator operator, Printer printer) {
		this.operator = operator;
		this.printer = printer;
	}
	public void closeBuy(Buy buy, Card card) {
		boolean authorized = operator.authorize(buy, card);
		
		if (authorized) {
			printer.print(buy);
		} else {
			System.out.println("Pagamento negado!");
		}
	}

}
