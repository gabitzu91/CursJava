package curs3;

import java.util.Scanner;

/*facem un program care citeste 3 r de la tastatura
 * verifica care dintre ele este cel mai mare si printeaza in consola
 * dc 2 nr sunt egale printeaza numere egale*/
public class CelMaiMareDintre3Numere {

	int nr1, nr2, nr3;
	
	public void askTheUserForThreeNumbers() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number:");
		nr1 = scan.nextInt();
		System.out.println("Please enter second number:");
		nr2 = scan.nextInt();
		System.out.println("Please enter third number:");
		nr3 = scan.nextInt();
	}
	
	public void findOutBigestNumber() {
		askTheUserForThreeNumbers();
		if(nr1>nr2 && nr1>nr3) {
			System.out.println("First number is the greatest");
		}else if(nr2>nr3 && nr2>nr1) {
			System.out.println("Second number is the greatest");
		}else if(nr3>nr1 && nr3>nr2) {
			System.out.println("Third number is the greatest");
		}else {
			System.out.println("Numbers are equal");
			}
		}
}
