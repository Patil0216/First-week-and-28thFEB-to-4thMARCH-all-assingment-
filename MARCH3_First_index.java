package Java.Fundamentals;

import java.util.Scanner;

public class MARCH3_First_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Entre elements of an Array");
		Scanner scan = new Scanner(System.in);
		int A[] = new int[5];
		for (int i = 0; i < 5; i++) {
			A[i] = scan.nextInt();
		}
		System.out.print(A[0]);
	}

}
