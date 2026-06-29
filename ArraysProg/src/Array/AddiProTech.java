package Array;
import java.util.Scanner;
public class AddiProTech{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int [] a=new int[n];
		 int sum=0;
         int pro=1;
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter : ");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			if(isTech(a[i])) {
				sum+=a[i];
				pro*=a[i];
			}
		}
		System.out.println("Addition : "+sum);
		System.out.println("Multiplication : "+pro);
		sc.close();
		
	}
	public static int den(int n) {
		int d=1;
		int ct=ct(n);
		for(int i=0;i<ct/2;i++) {
			d*=10;
		}
		return d;
	}
	public static int ct(int n) {
		int c=0;
		for(int i=n;i!=0;i/=10) {
			c++;
		}
		return c;
	}
	public static boolean isTech(int n) {
		if(ct(n)%2==0) {
			int last= n%den(n);
			int first= n/den(n);
			int sum=first+last;
			sum=sum*sum;
			return sum==n;
		}
		return false;
	}
	

}
