package java_programming_cls;

public class mergeTWOarray {

	public static void main(String[] args) {
int [] a= {10,20,30,40,50,60};
int [] b= {70,80,90,100,110};
int[] c=new int[a.length+b.length];

for(int i=0;i<a.length;i++) {
	
	c[i]=a[i];
}
for(int i=0;i<b.length;i++) {
	c[a.length+i]=b[i];
}
for(int i=0;i<c.length;i++) {
	System.out.print(c[i]+" ");
}
	}

}
