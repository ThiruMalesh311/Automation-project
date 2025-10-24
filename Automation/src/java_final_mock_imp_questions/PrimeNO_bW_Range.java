package java_final_mock_imp_questions;

import java.util.Scanner;

public class PrimeNO_bW_Range {

	public static void main(String[] args) {
int m=1;
int n=10;

for(int i=m;i<=n;i++)
{
	int count=0;
	
	for(int j=1;j<=i;j++)
	{
		if(i%j==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.println(i);
	}
   
	}}

}
