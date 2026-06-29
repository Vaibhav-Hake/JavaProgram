package Array;
import java.util.Scanner;
public class RepOdd {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int [] a=new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter : ");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				a[i]=-1;
			}
		}
		sc.close();
		
	}
	
	
	
	

}
