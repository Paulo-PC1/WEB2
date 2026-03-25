package br.edu.ifspcjo.ads.web2.checkout.view;

import br.edu.ifspcjo.ads.web2.checkout.model.Buy;
import br.edu.ifspcjo.ads.web2.checkout.model.Card;
import br.edu.ifspcjo.ads.web2.checkout.model.Checkout;
import br.edu.ifspcjo.ads.web2.checkout.model.Cielo;
import br.edu.ifspcjo.ads.web2.checkout.model.Epson;
import br.edu.ifspcjo.ads.web2.checkout.model.Operator;
import br.edu.ifspcjo.ads.web2.checkout.model.Printer;

public class Main {

	public static void main(String[] args) {
		Operator operator = new Cielo();
		Printer printer = new Epson();
		Card card = new Card("PEDRO P SILVA", "123456");
		Buy buy = new Buy("Pedro Paulo da Silva", 10.0, "Sorvete");
		Checkout checkout = new Checkout(operator, printer);
		checkout.closeBuy(buy, card);
	}

}
