package curs2;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Rectangle obiect = new Rectangle();
		obiect.latime = 5;
		obiect.lungime = 3;
		System.out.println(obiect.calculArie(obiect.lungime, obiect.latime));
		
		Rectangle obiect2 = new Rectangle();
		obiect2.latime = 4;
		obiect2.lungime = 3;
		System.out.println(obiect2.calculArie(obiect2.lungime, obiect2.latime));
		*/
		Rectangle obiect3 = new Rectangle(8,12);
		System.out.println(obiect3.calculArie());
		System.out.println(obiect3.afiseazaCuloareDreptunghi());
		
		Rectangle obiect4 = new Rectangle(4,7,"GALBEN");
		System.out.println(obiect4.afiseazaCuloareDreptunghi());
	}

}
