package curs5;

import java.util.Scanner;

public class TestPalindrom {

	public static void main(String[] args) {
		boolean aux=true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu un cuvant:");
		String cuvant = scan.nextLine();
		int n = cuvant.length();
		for(int i=0;i<(n/2);++i) {
			if(cuvant.charAt(i)!=cuvant.charAt(n-i-1)) {
					aux=false;
			}
		}
		if(aux==true) {
			System.out.println("Cuvantul este palindrom");
		}else {
			System.out.println("Cuvantul nu este palindrom");
		}
	}
}
