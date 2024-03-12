package curs3;

import java.util.Scanner;

public class CheckPunctajTest {

	int nota;
	public void askTheUserForTestScore() {
		System.out.println("Introdu nota:");
		Scanner scan = new Scanner(System.in);
		nota = scan.nextInt();
	}
	
	public void checkScoreofTest() {
		askTheUserForTestScore();
		if(nota >= 0 && nota<= 65) {
			System.out.println("Ai picat. Mai incearca!");
		}else if(nota >= 66 && nota <= 100){
			System.out.println("Felicitari, Ai trecut!");
		}else {
			System.out.println("Nota introdusa nu este valida");
		}
	}
}
