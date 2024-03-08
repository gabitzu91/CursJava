package curs3;

import java.util.Scanner;

/*Facem un program care verifica daca userul a introdus o litera
 * Daca a introdus litera, printam: caracterul este o litera
 * Daca a introdus altceva, printam: caracterul nu este o litera
 * */
public class VerificareCaracter {

	char caracter;
	
	/*
	 * char primitiv
	 * string secventa de caractere
	 * 
	 * televizor
	 * 012345678
	 * 
	 * televizor.charAt(5) == i
	 */
	
	public void askTheUserForACharacter() {
		System.out.println("Please enter a character:");
		Scanner scan = new Scanner(System.in);
		caracter = scan.next().charAt(caracter);
	}
	
	public void checkIfCharacterIsLetter() {
		askTheUserForACharacter();
		
		if(Character.isLetter(caracter)) {
			System.out.println("caracterul este o litera");
		}
		else {
			System.out.println("caracterul nu este o litera");	
		}
	}
}
