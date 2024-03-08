package curs3;

import java.util.Scanner;

/* Program care verifica daca un nr este par sau impar
 * Daca nr este par printam: The number <nr> is even!
 * Daca nr este impar: The number <nr> is odd!
 * Numarul il citim de la tastatura
 */

public class CheckOddOrEven {

	int numar;
	
	public void askTheUserForANumber() {
		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		numar = scan.nextInt();
	}
	
	public void checkNumberIsOddOrEven() {
		
		askTheUserForANumber();
		
		if (numar % 2 == 0) {
			System.out.println("The number " + numar + " is even!");
		}
		else {
			System.out.println("The number " + numar + " is odd!");
		}
	}
	
}
