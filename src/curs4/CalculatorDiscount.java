package curs4;

import java.util.Scanner;

public class CalculatorDiscount {

	double invoice;
	public void askTheUserForInvoice() {
		System.out.println("Introdu valoarea facturii:");
		Scanner scan = new Scanner(System.in);
		invoice = scan.nextInt();
	}
	
	public double getDiscount() {
		askTheUserForInvoice();
		double discount = invoice>=100? invoice*10/100 : invoice*5/100;
		System.out.println("Valoarea discountului este:" + discount);
		System.out.println("Valoarea facturii finale este:" + (discount+invoice));
		return discount;
	}
}
