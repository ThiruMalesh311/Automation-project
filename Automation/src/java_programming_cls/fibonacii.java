package java_programming_cls;

public class fibonacii {

	public static void main(String[] args) {
       int a=0;
       int b=1;
       System.out.println(a+" ");
       System.out.println(b+" ");
       
       for(int i=3;i<=10;i++) {
    	   int sum = a+b;
    	   System.out.println(sum);
    	   a=b;
    	   b=sum;
       }
	}

}
