package Java.Fundamentals;

import java.util.Scanner;

public class FEB28_Calculator {
	public static int add(int a, int b) {
		int sum = a + b;
		return sum;

	}

	public static int diff(int a, int b) {
		int diff = a - b;
		return diff;

	}

	public static int mul(int a, int b) {
		int mul = a * b;
		return mul;

	}

	public static int div(int a, int b) {
		int div = a / b;
		return div;

	}

	public static int rem(int a, int b) {
		int rem = a % b;
		return rem;

	}
	public static int avg(int a, int b) {
		int avg  = (a+b)/2;
		return avg;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char N = 'A';
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter First number :: ");
			int a = scan.nextInt();
			System.out.println("Enter Second number :: ");
			int b = scan.nextInt();
			System.out
					.println("Enter Choice :: 1: Addition, 2: Subtraction, 3: Multiplication, 4: Divide, 5: Remender, 6: Average");
			int choice = scan.nextInt();
			if (choice > 0 || choice < 7) {
				switch (choice) {
				case 1:
					int result = add(a, b);
					System.out.println(result);
					break;
				case 2:
					int result1 = diff(a, b);
					System.out.println(result1);
					break;
				case 3:
					int result2 = mul(a, b);
					System.out.println(result2);
					break;
				case 4:
					int result3 = div(a, b);
					System.out.println(result3);
					break;
				case 5:
					int result4 = rem(a, b);
					System.out.println(result4);
					break;
				case 6:
					int result5 = avg(a, b);
					System.out.println(result5);
					break;
				}
			} else {
				System.out.println("Invalid Choice");
			}

			System.out.println("You want to procced:: Y/N");
			N = scan.next().charAt(0);

		} while (N == 'Y' || N == 'y');
	}

}
