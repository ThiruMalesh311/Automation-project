package patterns_java_programming;

public class Assignmentthree {

	public static void main(String[] args) {
		 int n=4;
		 for(int i=1;i<=n;i++) {
			 
			 int m=1;
			 char ch='A';
			 for(int j=n;j>=1;j--) {
				 if(i<=j) {ch++;
					 if(i%2==0) {
						 System.out.print(m+" ");
					 }else {
						 System.out.print(ch+" ");
					 }
 }
			 }
		System.out.println();
		 
		 }
	}}
