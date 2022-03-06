package Java.Fundamentals;

import java.util.Scanner;

public class MARCH1_Reverse_num_method {
	public static int ReverseNumber(int num) {

		int rev = 0;
		while (num != 0)
		{
			int rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;

		}
		return rev;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Entere number" );
		int a = scan.nextInt();

		int result = ReverseNumber(a);
		{
			System.out.print(result);
		}

	}

}
