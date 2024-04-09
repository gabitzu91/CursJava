package curs12;

import java.util.Scanner;

public class TestAgeVerifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AgeVerifier obj = new AgeVerifier();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age:");
		int age=scan.nextInt();
		
		try {
			obj.checkAgeLimit(age);
		}catch(InvalidAgeException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Invalid age to vote!");
		}
		
		System.out.println("Code after");
	}

}
