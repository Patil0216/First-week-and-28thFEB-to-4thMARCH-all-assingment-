package Java.Fundamentals;

public class MARCH3_Sum_array_method {
	public static void Add(int a, int b) {
		int A[] = { 10, 20, 30 };
		int B[] = { 20, 40, 50 };
		int C[] = new int[A.length];
		System.out.print("Sum of two array is :: ");
		for (int i = 0; i < A.length; i++) {
			C[i] = A[i] + B[i];
			System.out.print(C[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 0;
		Add(a, b);
	}

}
