package java_final_mock_imp_questions;

import java.util.Scanner;

public class fibonacii_series {

	public static void main(String[] args) {
    
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		int a=0;
		int b=1;
		System.out.println(a+" ");
		System.out.println(b+" ");
		
		for(int i=3;i<=n;i++) {
			int sum=a+b;
			System.out.println(sum+" ");
			a=b;
			b=sum;
		}
		
	}

}
