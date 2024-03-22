package curs7;

import java.util.Scanner;

/*username nu e null si nici mai mic de 6 caractere*/
public class UserRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String username = scan.next();
		
		while(!username.equals(null)&& username.length()<6) {
			System.out.println("Introdu username:");
			username = scan.next();
		}
		
		System.out.println();
	}

}
