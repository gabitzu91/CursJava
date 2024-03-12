package curs4;

import java.util.Scanner;

/*Facem un calc simplu pentru op de baza +(adunare) -(scadere) * sau x(inmultire)
 * intrebam user un nr
 * intrebam user op matematica
 * intrebam al doilea nr
 * printam rezultatul*/
public class SimpleCalculator {
 int num1, num2, result;
 char operatieMate;
 
 public void askTheUser() {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Please enter first number:");
	 num1 = scan.nextInt();
	 System.out.println("Please enter the operation:");
	 operatieMate = scan.next().charAt(0);
	 System.out.println("Please enter second number:");
	 num2 = scan.nextInt();
	 
 }
 
 public void calculateValue() {
	 askTheUser();
	 if(operatieMate == '+') {
		 result = num1+num2;
		 displayResult();
	 }else if(operatieMate == '-') {
		 result = num1-num2;
		 displayResult();
	 }else if(operatieMate == '*' || operatieMate == 'x') {
		 result = num1*num2;
		 displayResult();
	 }else if(operatieMate == '/' || operatieMate == ':') {
		 result = num1/num2;
		 displayResult();
	 }else{
		 System.out.println("Operatie necunoscuta!");
	 }
 }
 
 public void displayResult() {
//	 if(operatieMate == 'x' || operatieMate == '*' || operatieMate == "+" || 
//			 operatieMate =='-' || operatieMate == "/" || operatieMate == ":") {
	 System.out.println(num1 + " "+operatieMate + " "+num2 + " =" + result);
//	 	}
	 }
}
