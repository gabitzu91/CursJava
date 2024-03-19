package curs6;

import java.util.Scanner;

public class WithdrawExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  =  new Scanner(System.in);
		System.out.println("Ce suma vrei sa retragi:");

		int sold = 1000;
		int sumaRetrasa =  scan.nextInt();
	//	for(int i = 1; i < sold-1; i++) {}
	
		while(sumaRetrasa < 1 || sumaRetrasa >= sold) {
			
			System.out.println("Suma indisponibila. Introdu alta suma:");
			sumaRetrasa =  scan.nextInt();
		}
		
		System.out.println("Va rugam ridicati banii!");
		System.out.println("Noul sold este " + (sold-sumaRetrasa));
		
		//System.out.println("Mai vrei si alta operatiune?");
		//boolean raspuns = scan.nextBoolean();
		
		}

}
