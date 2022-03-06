package Java.Fundamentals;
import java.util.Scanner;
public class MARCH2_MUl_Fact_D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Entre multiplying factor d");
int d=scan.nextInt();
int A[]=new int[10];
System.out.println("Entre elements of an Array");
for(int i=0;i<10;i++) {
	 A[i]=scan.nextInt();
	 A[i]=A[i]*d;
	 System.out.println(A[i]+" ");
}
	}

}
