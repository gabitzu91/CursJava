package curs4;
/*scriu prg de tip calc care calc tva-ul la o suma data
 * tva poate avea val diferite
 * afisam calcul tva pt diverse valori
 * 
 * afisam nr total de calcule facute
 * */
public class CalculatorTVA {

	//counter global
	private static int counterGlobal = 0;
	//valoare TVA
	private double tvaDouble;
	
	public CalculatorTVA(int tva) {
		this.tvaDouble = tva/100.0;
	}
	
	public double adunaTva(double suma) {
		counterGlobal++;
		return suma * (1 + tvaDouble);
	}
	
	public static int getCounterGlobal() {
		return counterGlobal;
	}
}
