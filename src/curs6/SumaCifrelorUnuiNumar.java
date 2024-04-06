package curs6;

import java.util.Scanner;

public class SumaCifrelorUnuiNumar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rezolvare();
	}

	public static void rezolvare() {
		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		int nr=scan.nextInt();
		int sum =0;
		while(nr!=0) {
			sum+=nr%10;
			nr=nr/10;
		}
		System.out.println("Suma numerelor este "+ sum);
	}
}
