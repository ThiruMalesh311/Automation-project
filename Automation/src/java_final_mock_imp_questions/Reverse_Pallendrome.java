package java_final_mock_imp_questions;

import java.util.Scanner;

public class Reverse_Pallendrome {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();

int rev=0;
int temp=n;
while(n>0)
{
	int rem=n%10;
	rev=rev*10+rem;
	n=n/10;
}
if(temp==rev)
{
	System.out.println("pallendrome no");
}else
{
	System.out.println("not a pallendrome");
}
	}

}
