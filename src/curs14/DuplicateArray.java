package curs14;

import java.util.HashSet;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		String[] names= {"Ion","Oana","Maria","Ion","Oana","Bogdan","Ion","Oana"};
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					//System.out.println("Nume duplicat: " + names[i]);
					set.add(names[i]);
				}
			}
		}
		System.out.println(set);
		System.out.println("--------------------------");
		
	/*	for(String nume:names) {
			if(!set.add(nume)) {
				System.out.println("Nume duplicat: " + set);
			}
		}*/
	}

}
