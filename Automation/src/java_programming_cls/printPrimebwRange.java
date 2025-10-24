package java_programming_cls;
import java.util.Scanner;

public class printPrimebwRange {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int m=sc.nextInt();
int n=sc.nextInt();

for(int i=m;i<=n;i++) {
	int count=0;
	for(int j=1;j<=i;j++) {
		if(i%j==0) {
			count++;
		}
		}
	if(count==2) {
		System.out.println(i);
	}
}
	}

}
