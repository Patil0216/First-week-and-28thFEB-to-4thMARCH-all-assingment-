package Java.Fundamentals;

public class MARCH3_Binary_Decimal_num {
	public static void BinaryDec(int a) {

		int sum = 0, i = 0;
		
		while (a != 0) {
			int r = a%10;
			sum = sum +(int) (r * Math.pow(2, i));
			a = a /10;
			i++;
		}
		System.out.print(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1001;
		BinaryDec(a);

	}

}
