package java_programming_cls;
import java.util.Scanner;

public class SumofFactors {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
     int n=sc.nextInt();
     
     int sum = 0;
     for(int i=1;i<=n;i++) {
    	 if(n%i==0) {
    		 sum=sum+i;
    	 }
     System.out.println("Sum of Factors is "+sum);
     }
	}

}
