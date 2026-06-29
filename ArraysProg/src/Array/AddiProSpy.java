package Array;
import java.util.Scanner;
public class AddiProSpy{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int sum=0;
		int pro=1;
		int [] a=new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter : ");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			if(isSpy(a[i])) {
				sum+=a[i];
				pro*=a[i];
			}
		}
		System.out.println("Addition : "+sum);
		System.out.println("Multiplication : "+pro);
		
	}
	public static int sum(int n) {
		int sum=0;
		while(n!=0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
	public static int pro(int n) {
		int p=1;
		while(n!=0) {
			p*=n%10;
			n/=10;
		}
		return p;
	}
	public static boolean isSpy(int n) {
		return sum(n)==pro(n);
	}

}
