package Array;
import java.util.Scanner;
public class DecimalToBin{
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
			System.out.println(a[i]+" : "+bin(a[i]));
			}
		sc.close();
		}
		public static int bin(int n) {
			int b=0;
			int pos=1;
			while(n!=0) {
				b=b+n%2*pos;
				pos*=10;
				n/=2;
			}
			return b;
		}
	
		
	}

	


