package java_programming_cls;

import java.util.Scanner;

public class PalindroneNo {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
     int n=sc.nextInt();
     
     int temp=n;
     int rev=0;
     while(n>0) {
    	 int rem=n%10;
    	  rev=rev*10+rem;
    	  n=n/10;
     }
	if(temp==n)
	{
		System.out.println("given number is palindrome number");
	}else
	{
		System.out.println("given number is not a palindrome number");
	}
	}

}
