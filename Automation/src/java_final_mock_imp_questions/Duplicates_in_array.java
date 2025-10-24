package java_final_mock_imp_questions;

public class Duplicates_in_array {

	public static void main(String[] args) {
int [] a= {10,10,50,30,60,10,80,20,50};
boolean[] b=new boolean[a.length];

for(int i=0;i<a.length;i++) {
	int count=1;
	
	if(b[i]==false) {
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				count++;
				b[j]=true;
			}
		}
		System.out.println(a[i]+"accured"+count+"times");
	
	//	if(count==0) {
		//	System.out.println(a[i]+"is a unrepetead element");
		}
	}

	}

}




