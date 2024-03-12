package curs4;

import java.util.Scanner;

// var= (cond) ? expr dc true : expr dc false

public class TernaryOperator {
 
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Please enter first number:");
		 int num1 = scan.nextInt();
		 System.out.println("Please enter second number:");
		 int num2 = scan.nextInt();
		 
		 if(num1>0) {
			 System.out.println("num1 este pozitiv");
		 }else {
			 System.out.println("num1 este negativ");
		 }
		 
		 //var = cond?true:false
		 String result = (num1 > 0) ? "num1 este pozitiv" : "num1 este negativ";
		 System.out.println(result);
		 
		 //verific dc num1 si num2 sunt pozitive
		 result = num1 > 0 && num2 > 0 ? "ambele sunt pozitive" : "unul din numere e negativ";
		 System.out.println(result);
		 
		 //verific care nr e mai mare si dc sunt egale
		 if(num1>num2) {
			 System.out.println("num1 este mai mare");
		 }else if (num1==num2) {
			 System.out.println("numerele sunt egale");
		 }else {
			 System.out.println("num2 este mai mare");
		 }
		 
		 result = num1 == num2 ? "numerele sunt egale" : num1 > num2 ? "num1 este mai mare" : "num2 este mai mare";
		 System.out.println(result);
	}
}
