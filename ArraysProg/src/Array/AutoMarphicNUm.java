package Array;
import java.util.Scanner;
public class AutoMarphicNUm{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int [] a=new int[n];
		int ct=0;
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter : ");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			if(isAutoMarphic(a[i])) {
				ct++;
				System.out.println(a[i]);
			}
		}
		System.out.println("Count of Sunny num from array "+ct);
		sc.close();
		
	}
	public static boolean isAutoMarphic(int n) {
		int sq=n*n;
		return sq%den(n)==n;
	}
	public static int den(int n) {
		int d=1;
		for(int i=n;i!=0;i/=10) {
			d*=10;
		}
		return d;
	}

}
