package curs15;

public class VarargsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printCeva("A","B");
		printCeva("A","B","C");
		printCeva();
		
	}

//	public static void printCeva(String a, String b) {
//		System.out.println(a);
//		System.out.println(b);
//	}
	
	public static void printCeva(String...values) {
		for(String element : values) {
			System.out.println(element);
		}
	}
}
