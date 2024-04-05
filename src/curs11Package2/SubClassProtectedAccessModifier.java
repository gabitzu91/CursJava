package curs11Package2;

import curs11Package1.ProtectedAccessModifier;

public class SubClassProtectedAccessModifier extends ProtectedAccessModifier{
//sub class different package: yes
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClassProtectedAccessModifier obj = new SubClassProtectedAccessModifier();
		obj.printMesaj();
	}

}
