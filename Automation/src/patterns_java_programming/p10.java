package patterns_java_programming;

public class p10 {

	public static void main(String[] args) {
      int n=4;
      int m=1;
      char ch='A';
     
     for(int i=1;i<=n;i++)
     {
         
    	 for(int j=1;j<=n;j++) {
    		 
    		 if(i%2==0) {
    			 System.out.print(m+" ");
    			 
    		 }else {
    		 System.out.print(ch+" ");
    	 }
    	 }
    	 
    System.out.println();  

	}

}}
