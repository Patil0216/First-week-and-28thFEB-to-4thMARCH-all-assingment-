package Java.Fundamentals;
import java.util.Scanner;
public class FEB28_Add2_num extends Factorial {
	public static int Add(int a, int b) {
		int sum = a + b;
		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter first number :: ");
		int a=scan.nextInt();
		System.out.print("Enter second number :: ");
		int b=scan.nextInt();
		 int sum=Add(a,b);
		 System.out.print(sum);
	}

}
