package curs5;

import java.util.Scanner;

public class SumOfTen {

	int total=0;
	int nr;
	public void Suma() {
		for(int i=0;i<10;i++) {
			System.out.println("Please enter number " + (i+1) + " :");
			Scanner scan = new Scanner(System.in);
			nr = scan.nextInt();
			total+=nr;
		}
		System.out.println("The sum of the numbers is: " + total);
	}
}
