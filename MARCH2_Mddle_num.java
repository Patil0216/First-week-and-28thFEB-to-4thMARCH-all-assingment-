package Java.Fundamentals;

import java.util.Scanner;

public class MARCH2_Mddle_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,p=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter elements of an Array ::");
       int A[]=new int[10];
       for( i=0; i<10;i++) {
    	   A[i]=scan.nextInt();
       }
       for( i=0; i<(10)/2;i++) {

        p=A[i];
       } System.out.print(p);

        		
	}

}
