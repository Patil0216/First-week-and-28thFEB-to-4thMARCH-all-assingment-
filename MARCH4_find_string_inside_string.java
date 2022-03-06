package Java.Fundamentals;
import java.util.Scanner;
public class MARCH4_find_string_inside_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("enter main string");
		String str = scan.nextLine();

		System.out.println("enter a word which you want to find in string");
		String word = scan.nextLine();

		int Index = str.indexOf(word);

		if(Index == - 1)
		{
		System.out.println(word+" not found");
		} else
		{
		System.out.println("Found "+ word +" at index "+ Index);
		}
		scan.close();
	}

}
