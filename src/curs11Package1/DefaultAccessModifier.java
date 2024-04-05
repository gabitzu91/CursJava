package curs11Package1;

public class DefaultAccessModifier {
/*
 * Default inseamna atunci cand nu specific nimic
 * Scopul este limitat la pachetul in care se afla
 * 
 *  Aceeasi clasa: yes
 * Alta clasa din acelasi pachet: yes
 * Subclasa (clasa copil) in acelasi pachet: yes
 * Subclasa in alt pachet: No
 * Alta clasa in alt pachet: NO
 * */
	String mesaj ="Default access modifier";
	
	void printMesaj() {
		System.out.println(mesaj);
	}
}
