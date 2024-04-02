package curs10;

public class Square extends Shape {

	String nume = "cerc";
	String culoare = "rosu";
	
	public Square(String nume, String culoare) {
		super(nume, culoare);
		// TODO Auto-generated constructor stub
	}

	public void printDetails() {
		System.out.println("Numele este: " + nume
				+ " si culoarea este: " + culoare);
	}
	
}
