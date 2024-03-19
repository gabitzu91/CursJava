package curs6;

import java.util.Scanner;

/*facem un program care calc salariul pe o saptamana
 * intrebam userul cate ore a lucrat
 * si calc doar dc a lucrat maxim 40 si min 1
 * dc introduce un nr invalid de ore il rugam sa introduca din nou
 * pana introduce un nr valid
 * rate per hour =25
 * */
public class WhileExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Cate ore ai lucrat?");
		int oreLucrate = scan.nextInt();
		
		while(oreLucrate<1 || oreLucrate>40) {
			System.out.println("Nr de ore invalid");
			System.out.println("Introdu un nr valid de ore (intre 1 sau 40):");
			oreLucrate = scan.nextInt();
		}
		System.out.println("Salariul tau pentru orele lucrate este:" + 25*oreLucrate);
	}

}
