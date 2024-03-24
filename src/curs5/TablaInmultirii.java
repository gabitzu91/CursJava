package curs5;

import java.util.Scanner;

public class TablaInmultirii {

	int nr;
	public void askTheUserForANumber() {
		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		nr=scan.nextInt();
	}
	public void inmultiri() {
		askTheUserForANumber();
		for(int i=0;i<10;i++) {
			System.out.println(nr + "*" + (i+1) + "=" + nr*(i+1));
		}
	}
}
