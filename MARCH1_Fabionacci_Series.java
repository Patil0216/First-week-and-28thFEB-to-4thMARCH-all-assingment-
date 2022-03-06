package Java.Fundamentals;

public class MARCH1_Fabionacci_Series {
	public static void FabonacciSerise(int num) {
		int num1 = 0;
		int num2 = 1;
		int num3=0;
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		for (int i = 0; i < 10; i++) {
			 num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
            System.out.print(num3+" ");
			

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		FabonacciSerise(num);
		
	}

}
