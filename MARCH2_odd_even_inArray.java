package Java.Fundamentals;

import java.util.Scanner;

public class MARCH2_odd_even_inArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int count = 0, count1 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Entre elements of an array ::");
		int a[] = new int[10];

		for (int j = 0; j < 10; j++) {
			a[j] = scan.nextInt();
			if (a[j] % 2 == 0) {
				count++;
			} else {
				count1++;
			}
		}
		System.out.println("How many even numbers present in an array ? "+count );
		System.out.print("How many odd numbers present in an array ? "+count1);
	}
}
