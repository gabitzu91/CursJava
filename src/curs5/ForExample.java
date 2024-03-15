package curs5;

public class ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<10; i++) {
			
			if(i==5) {
				//break; //intrerupe de tot
				continue; //sare iteratia curenta si te arunca la urmatoarea
			}
			
			System.out.println("Valoarea lui i este:" + i);
		}
	}

}
