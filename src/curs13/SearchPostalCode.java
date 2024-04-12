package curs13;

import java.util.Scanner;

/*facem un program care cauta un oras pe baza unui cod postal
 * avem 6 orase si 6 coduri postale
 * avem nevoie de o functionalitate care sa caute pe baza unui cod 
 * si care sa intoarca orasul
 * Daca codul posta nu exista in lista mea de coduri atunci arunca mesajul
 * CodPostalException
 * daca apare exceptia vreau sa intreb din nou pana primesc un cod corect
 * 
 */
public class SearchPostalCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		CoduriPostale cp = new CoduriPostale();
		//System.out.println(cp.coduriPostale);
		String oras = "";		
		do {
			System.out.println("Introdu un cod postal:");
			int cod = scan.nextInt();
			try {
				oras = cp.gasesteOras(cod);
				System.out.println("Orasul asociat codului " + cod + " este " + oras);
			} catch (CodPostalException e) {
				e.printStackTrace();
			}catch(Exception e) {
				System.out.println("Some error occured.Please try again!");
			}
		}while(oras.equals(""));
		
	}

}
