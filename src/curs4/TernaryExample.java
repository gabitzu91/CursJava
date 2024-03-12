package curs4;
/*simulam un cos de cumparaturi
 * avem 3 validari
 * 1. verif dc cosul e gos sau nu si printam
 * 2. verif dc cosul contine peste 100 lei
 * 3. verif dc nr de prod este mai mare sau egal cu 5 (adica cos mare -- printam)
 * si dc val cosului e peste 150 lei (adica val mare -- printam)
 * */
public class TernaryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numarProduse = 1;
		int totalPretCos = 160;
		
		//1.
		String mesaj = numarProduse > 0 ? "Avem produse" : "Cos gol!";
		System.out.println(mesaj);
		
		//2.
		mesaj = totalPretCos > 100 ? "Totalul depaseste 100 lei" : "Total sub 100 lei";
		System.out.println(mesaj);
		
		//3.
		mesaj = numarProduse >= 5 && totalPretCos > 150 ? "Cos mare cu val mare" :
			numarProduse < 5 && totalPretCos < 150 ? "Cos mic cu val mica" : "Cos intermediar";
		System.out.println(mesaj);
	}

}
