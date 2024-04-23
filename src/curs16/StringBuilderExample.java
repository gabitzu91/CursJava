package curs16;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverseString("masina");
		replaceFromString("Salut Bogdan" , 0,5,"Oana");
		//                 01234567891011
		insertIntoString("televizor", 4, " color");
		//                012345678
		addSpacesToText("thisIsACamelCaseText");
		deleteFromString("Salut Ion Popescu", 6, 10);
		//                012345678910
		appendToString("tele","vizor");
	}

	public static void reverseString( String text) {
		StringBuilder sb = new StringBuilder(text);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
	
	public static void replaceFromString(String text, int startIndex,
										int endIndex, String textToReplace) {
		StringBuilder sb = new StringBuilder(text);
		System.out.println(sb);
		sb.replace(startIndex, endIndex, textToReplace);
		System.out.println(sb);
	}
	
	public static void insertIntoString(String text, int startIndex, 
										String textToInsert) {
		StringBuilder sb = new StringBuilder(text);
		System.out.println(sb);
		sb.insert(startIndex, textToInsert);
		System.out.println(sb);
	}
	
	//thisIsACamelCaseText
	public static void addSpacesToText(String text) {
		StringBuilder sb = new StringBuilder(text);
		System.out.println(sb);
		for(int i=0; i<sb.length();i++) {
			if(Character.isUpperCase(sb.charAt(i))) {
				sb.insert(i, " ");
				i++;
			}
		}
		System.out.println(sb);
	}
	
	public static void deleteFromString(String text, int startIndex,
										int endIndex) {
		StringBuilder sb = new StringBuilder(text);
		System.out.println(sb);
		//sb.deleteCharAt(4);
		sb.delete(startIndex, endIndex);
		System.out.println(sb);
	}
	
	public static void appendToString(String text, String textToAppend) {
		StringBuilder sb = new StringBuilder(text);
		System.out.println(sb);
		sb.append(textToAppend);
		System.out.println(sb);
	}
	
	
}
