package curs4;

import java.util.Scanner;

public class CalculatorDiscount {

	int invoice;
	public void askTheUserForInvoice() {
		System.out.println("Introdu valoarea facturii:");
		Scanner scan = new Scanner(System.in);
		invoice = scan.nextInt();
	}
	
	public double getDiscount() {
		
	}
}
