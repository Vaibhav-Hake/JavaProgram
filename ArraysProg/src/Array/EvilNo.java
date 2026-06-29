package Array;
import java.util.Scanner;
public class EvilNo{
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
			if(bin(a[i])%2==0) {
				System.out.println(a[i]);
			}
			}
		sc.close();
		}
		public static int bin(int n) {
			int ct=0;
			while(n!=0) {
				if(n%2==1) {
					ct++;
				}
				n/=2;
			}
			return ct;
		}
	
		
	}

	


