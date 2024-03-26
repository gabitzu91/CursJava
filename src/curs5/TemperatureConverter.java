package curs5;

import java.util.Scanner;

public class TemperatureConverter {

	int nr;
	double temp;
	public int askTheUserForNumberOfConversions() {
		System.out.println("Cate temperaturi vrei sa transformi?");
		Scanner scan = new Scanner(System.in);
		nr = scan.nextInt();
		return nr;
	}
	public void convertToFarenheit() {
		nr = askTheUserForNumberOfConversions();
		for(int i=0;i<nr;i++) {
			System.out.println("Introdu temperatura in grade Celsius:");
			Scanner scan = new Scanner(System.in);
			temp = scan.nextDouble();
			System.out.println("Temperatura Celsius de " + temp + "grade este in Farenheit " +(temp+76.8) +" grade");
		}
	}
}

