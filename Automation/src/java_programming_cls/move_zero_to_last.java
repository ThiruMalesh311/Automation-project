package java_programming_cls;

public class move_zero_to_last {

	public static void main(String[] args) {
int [] a= {10,0,20,0,30,0,40};
int count=0;
for(int i=0;i<a.length;i++) {
	
	if(a[i]!=0) {
		
		a[count]=a[i];
		count++;
	}
}
while(count<a.length) {
	a[count]=0;
	count++;
}
for(int j=0;j<a.length;j++) {
	System.out.print(a[j]+" ");
}
	
	}

}
