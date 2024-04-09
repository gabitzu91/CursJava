package curs7;

import java.util.Scanner;

/*username nu e null si nici mai mic de 6 caractere*/
public class UserRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu username :");
		String username = scan.next();
		
		while(username.equals(null) || username.length()<6) {
			System.out.println("Introdu username:");
			username = scan.next();
		}
		
		System.out.println("Username-ul este " + username);
		
		System.out.println("---------------------------------------------");
		
		do {
			System.out.println("Introdu username :");
			username =  scan.next();	
			
		}while(username.equals(null) || username.length()<6);
		
		System.out.println("Username-ul este " + username);

		scan.close();
	}

}
