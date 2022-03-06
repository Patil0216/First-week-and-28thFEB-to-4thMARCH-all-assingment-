package Java.Fundamentals;
import java.util.Scanner;

public class MARCH2_Even_num_inArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Entre elements of an array ::");
		int a[]=new int[10];
		
		for(int i=0;i<10;i++)
		{
			a[i]=scan.nextInt();
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
			
		}

	}

}
