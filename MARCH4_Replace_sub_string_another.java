package Java.Fundamentals;

import java.util.Scanner;

public class MARCH4_Replace_sub_string_another {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Entere a String ::->");
		String sentence=scan.nextLine();
		System.out.print("Entere a word you wanna remove in string ::->");
		String word=scan.nextLine();
		System.out.print("Entere a word you wanna replace in string ::->");
		String word1=scan.nextLine();
		System.out.print(sentence.replace(word,word1));

	}

}
