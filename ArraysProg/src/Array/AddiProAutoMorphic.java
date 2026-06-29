package Array;
import java.util.Scanner;
public class AddiProAutoMorphic{
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
			if(isAutoMarphic(a[i])) {
				sum+=a[i];
				pro*=a[i];
			}
		}
		System.out.println("Addition : "+sum);
		System.out.println("Multiplication : "+pro);
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
