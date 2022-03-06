package Java.Fundamentals;

import java.util.Scanner;

public class MARCH1_Swap_2_num_method {
	public static void SwapNum(int a,int b) {
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.print(a+" "+b);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Entre first number :: ");
		int a=scan.nextInt();
		System.out.println("Entre second number :: ");
		int b=scan.nextInt();
		SwapNum(a,b);
		 
			

	}

}
