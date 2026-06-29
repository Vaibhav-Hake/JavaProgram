package Array;
import java.util.Scanner;
public class AddiProPerfect {
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
			if(isPerfect(a[i])) {
				sum+=a[i];
				pro*=a[i];
			}
		}
		System.out.println("Addition : "+sum);
		System.out.println("Multiplication : "+pro);
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
