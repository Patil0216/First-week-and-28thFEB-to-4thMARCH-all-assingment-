package Java.Fundamentals;
import java.util.Scanner;
public class MARCH4_remove_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stuys
		Scanner scan=new Scanner(System.in);
		System.out.print("Entere a String ::->");
		String sentence=scan.nextLine();
		System.out.print("Entere a word you wanna skipped from a String ::->");
		String word=scan.nextLine();
		System.out.print(sentence.replace(word," "));

	}

}
