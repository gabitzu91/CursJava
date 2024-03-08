package curs3;

import java.util.Scanner;

/*Verificam daca suntem in zi lucratoare sau weekend
 * dc e zi lucratoare: Este zi lucratoare!
 * dc e weekend: Este weekend!
 * dc nu e  o zi valida: Ziua nu exista!
 */
public class VerificareZiASaptamanii {
 int zi;
 
 public void askTheUserForADay() {
		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		zi = scan.nextInt();
	}
 
 public void checkWeekDay() {
	 askTheUserForADay();
	 
	 if (zi>= 1 && zi <= 5) {
		 System.out.println("Its a working day!");
	 }else if(zi==6 || zi==7) {
		 System.out.println("Its weekend!");
	 }else {
		 System.out.println("Day not valid!");
	 }
 }
}
