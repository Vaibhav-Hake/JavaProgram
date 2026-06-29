package Array;
import java.util.Scanner;
public class StrongNum {
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
			if(isStrong(a[i])) {
				System.out.println(a[i]);
				ct++;
			}
		}
		System.out.println("Count of Strong num from array "+ct);
		sc.close();
		
	}
	public static boolean isStrong(int n) {
		return n==sum(n);
	}
	public static int sum(int n) {
		int sum=0;
		while(n!=0) {
			sum+=fact(n%10);
			n/=10;
		}
		return sum;
	}
	public static int fact(int n) {
		int fact=1;
		while(n>1) {
			fact*=n;
			n--;
		}
		return fact;
	}

	
	

}
