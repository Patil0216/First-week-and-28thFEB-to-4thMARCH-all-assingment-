package Java.Fundamentals;

import java.util.Scanner;

public class FEB28_int_float_long {
	public static int Multiplication(int a, int b) {
		int Mul = a * b;
		return Mul;

	}

	public static float Multiplication(float p, float q) {
		float Mul = p* q;
		return Mul;
	}

	public static long Multiplication(long x, long y) {
		long Mul = x * y;
		return Mul;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number :: ");
		int a = scan.nextInt();
		System.out.print("Enter second number :: ");
		int b = scan.nextInt();
		int Result = (Multiplication(a, b));
		System.out.println(Result);
		System.out.print("Enter first number :: ");
		float p = scan.nextFloat();
		System.out.print("Enter second number :: ");
	    float q = scan.nextFloat();
		float Result1 = Multiplication(p,q);
		System.out.println(Result1);
		System.out.print("Enter first number :: ");
		long x= scan.nextLong();
		System.out.print("Enter second number :: ");
		long y = scan.nextLong();
		long Result2 = Multiplication(x,y);
		System.out.println(Result2);
	}

}
