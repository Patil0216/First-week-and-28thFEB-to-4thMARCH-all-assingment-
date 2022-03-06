package Java.Fundamentals;

import java.util.Scanner;

public class MARCH3_last_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Entre size of array");
				int S= scan.nextInt();
				int A[] = new int[S];
				System.out.println("Entre elements of an Array");
				for (int i = 0; i < S; i++) {
					A[i] = scan.nextInt();
				}
				System.out.print(A[S-1]);
	}

}
