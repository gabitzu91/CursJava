package curs12;

public class ExceptionExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String nume = null; //"Bobo";
			System.out.println("Lungimea lui nume este: " +nume.length());
		}catch(Exception e) {
			System.out.println("Exception occured");
			System.out.println(3/0);
		}finally {
			System.out.println("Finally block of code!");
		}
		
		System.out.println("Code after TRY-CATCH");
		
	}

}
