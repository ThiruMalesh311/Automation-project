package java_final_mock_imp_questions;

public class Nth_largest_ele {

	public static void main(String[] args) {
 int [] a= {50,10,40,30,20};
 int n=2;
 
 for(int i=0;i<a.length;i++)
 {
	 int count=1;
	 
	 for(int j=0;j<a.length;j++)
	 {
		 if(a[j]>a[i])
		 {
			 count++;
		  }}
	 if(count==n) {
		 System.out.println(n+"nd largest ele is"+a[i]);
	 break;
	 
	 }}
	 }
 }
	


