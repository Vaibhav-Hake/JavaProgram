package Array;
import java.util.Scanner;
public class AddiProArmStrong{
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
			if(isArmStrong(a[i])) {
				sum+=a[i];
				pro*=a[i];
			}
		}
		System.out.println("Addition : "+sum);
		System.out.println("Multiplication : "+pro);
		sc.close();
		
	}
	public static boolean isArmStrong(int n) {
		return n==sum(n);
	}
	public static int ct(int n) {
		int ct=0;
		for(int i=n;i!=0;i/=10) {
			ct++;
		}
		return ct;
	}
	public static int power(int b,int r) {
		int p=1;
		for(int i =1;i<=r;i++) {
			p*=b;
		}
		return p;
	}
   public static int sum(int n) {
	   int ct=ct(n);
	   int sum=0;
	   while(n!=0) {
		   sum+=power(n%10,ct);
		   n/=10;
	   }
	   return sum;
   }
	
	

}
