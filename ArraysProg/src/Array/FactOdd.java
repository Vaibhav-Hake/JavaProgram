package Array;
import java.util.Scanner;
public class FactOdd{
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
				System.out.println(a[i]+" Factorial number : "+fact(a[i]));
			}
		}
		sc.close();
		
	}
	public static int  fact(int n) {
		int facto=1;
		while(n>1) {
			facto*=n;
			n--;
		}
		return facto;
	}
	
	
	

}
