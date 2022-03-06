package Java.Fundamentals;

import java.util.Scanner;

public class MARCH2_Sum_all_elements_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int sum=0;
		int A[] = new int[10];
		System.out.println("Enter Elements of an Array ::");
		for(int i=0;i<10;i++) {
			A[i]=scan.nextInt();
		}
		for( int i=0;i<10;i++) {
		 sum=sum+A[i];
		}
		System.out.print(sum);
	}
}
