package curs10;

public class TestMostenire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TesterAutomat tester = new TesterAutomat();
		tester.setProgrammingLanguage("Java");//clasa TesterAutomat
		tester.setDepartament("QA");//clasa Tester
		tester.setSeniority("Senior");//clasa Tester
		tester.setNume("Maria");//clasa Angajat
		tester.setEmail("maria@maria.com");//clasa Angajat
		
		System.out.println("Numele angajatului este " +tester.getNume()
		+ " este de senioritate " + tester.getSeniority() 
		+ " si scrie cod in " + tester.getProgrammingLanguage());
		
	}

}
