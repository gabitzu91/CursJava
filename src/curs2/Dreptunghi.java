package curs2;

import java.util.Scanner;

public class Dreptunghi {
	
	public static int calculArie(int lungime, int latime) {
		return lungime * latime;
	}
	
	public static int calculPerimetru(int lungime, int latime) {
		//int perimetru = 2*(lungime + latime);
		//return perimetru;
		return 2*(lungime + latime);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dreptunghi
		int lungime = 5;
		int latime = 3;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu lungime:");
		lungime = scan.nextInt();
		System.out.println("Introdu latime:");
		latime = scan.nextInt();
		
		//int arieDreptunghi = calculArie(lungime, latime);
		//System.out.println("Aria dreptunghiului este:" + arieDreptunghi);
		System.out.println("Aria dreptunghiului este:" + calculArie(lungime, latime));
		//int perimetru = calculPerimetru(lungime, latime);
		//System.out.println("Petrimetrul dreptunghiului este:" + perimetru);
		System.out.println("Perimetrul dreptunghiului este:" + calculPerimetru(lungime, latime));
		
		int lungime2 = 15;
		int latime2 = 13;
		
		int arieDreptunghi2 = calculArie(lungime2, latime2);
		System.out.println("Aria dreptunghiului este:" + arieDreptunghi2);
		
	}

}
