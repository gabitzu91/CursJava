package curs4;

import java.util.Scanner;

public class CheckCalificativ {

	int nota;
	public void askTheUserForGrade() {
		System.out.println("Ce punctaj ai obtinut?");
		Scanner scan = new Scanner(System.in);
		nota = scan.nextInt();
	}
	public void checkCalificativRange() {
		askTheUserForGrade();
		String calificativ = nota>=90? "FB" : (nota<90 && nota >=80)? "B" : "S";
		System.out.println("Nota se incadreaza la: " + calificativ);
		String rezultat = calificativ=="FB"? "Foarte bine" : calificativ =="B"? "Bine" : "Suficient";
		System.out.println("Ai primit: " + rezultat);
	}
}
