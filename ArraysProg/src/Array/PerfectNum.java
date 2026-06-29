package Array;
import java.util.Scanner;
public class PerfectNum {
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
			if(isPerfect(a[i])) {
				System.out.println(a[i]);
				ct++;
			}
		}
		System.out.println(ct);
		sc.close();
		
	}
	public static int sumFact(int n) {
		int sum=0;
		int d=1;
		while(d<=n/2) {
			if(n%d==0) {
				sum+=d;
			}
			d++;
		}
		return sum;
	}
	
	public static boolean isPerfect(int n) {
		return n==sumFact(n);
	}

}
