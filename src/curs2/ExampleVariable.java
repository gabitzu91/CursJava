package curs2;

public class ExampleVariable {
	
	String prenume;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declarare si initializare
		String nume = "Ion";
		// declarare simpla variabila
		int age;
		// initializare variabila
		age = 22;
		
		System.out.println(nume);
		
		var numar = 55;
		var masina = "Dacia"; 
		/*var keyword --not allowed
		 * method parameters
		 * instance variables
		 * return type 
		 * lambda expressions
		 * arrays
		 * constructor parameters
		 * */
		ExampleVariable obj = new ExampleVariable();
		obj.afiseazaMesaj("text");
	}

	public void afiseazaMesaj(String ceva) {
		String numeFamilie = "popescu";
		System.out.println(numeFamilie + prenume);
		
	}
	
	public void afiseazaAltMesaj() {
		afiseazaMesaj(prenume);
		//numeFamilie = "ionescu";
		prenume = "elena";
	}
}
