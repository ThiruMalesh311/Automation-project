package java_programming_cls;

import com.beust.ah.A;

public class Reverse_the_given_array {

public static void main(String[] args) {

	int [] a= {10,20,30,40,50,60,70};
	int i=0;
	int j=a.length-1;
	
	while(i<j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
	}
	
	for(int k=0;k<a.length;k++) {
		
		System.out.print(a[k]+" ");
	}
}}