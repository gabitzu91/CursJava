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
		}else {
			System.out.println("Felicitari, Ai trecut!");
		}
	}
}
