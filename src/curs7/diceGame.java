package curs7;

import java.util.Scanner;

/*facem un joc de zaruri in care avem urm reguli
 * 1. daca userul da in total 2,6,11 --> pierde jocul --> facem exit
 * 2. dc userul da in total 8,12 --> castiga jocul --> facem exit
 * 3. dc userul da in total 3,9 --> repeta automat aruncarea
 * 4. dc da orice alta varianta decat cele de mai sus il intrebam dc vrea sa mai dea o data
 * raspunsul tb sa fie de forma yes/no si mapam in spate pe un true/false
 * dc raspunde nu --> facem exit
 * dc da o luam de la capat*/
public class diceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean incercare = true;
				
		while (incercare) {
			int dice = (int)(Math.random()* 6+1);
			int dice2 = (int)(Math.random()* 6+1);
			int total = dice + dice2;
			
			if (total==2||total==6||total==11) {
				System.out.println("Imi pare rau! Ai dat " +total + " Ai pierdut jocul!");
				break;
			}else if(total==8||total==12) {
				System.out.println("Felicitari! Ai dat " + total + " Ai castigat!");
				break;
			}else if(total==3||total==9) {
				System.out.println("Ai dat " + total + " Automat mai dai o data!");
				continue;
			}else {
				System.out.println("Ai dat" + total);
				boolean continuare = true;
				while(continuare) {
				System.out.println("Mai vrei sa continui jocul?");
				Scanner scan = new Scanner(System.in);
				String raspuns = scan.next().toLowerCase();
				//incercare = scan.next().equalsIgnoreCase("yes")? incercare == true : incercare ==false;
				if(raspuns.equals("yes")) {
					incercare = true;
					continuare = false;
				}else if(raspuns.equals("no")) {
					incercare = false;
					continuare = false;
				}else {
					System.out.println("Raspuns invalid. Raspunde cu Yes sau No");
					continuare = true;
				}
				}
			}
		}
		System.out.println("Game over!");
	}

}
