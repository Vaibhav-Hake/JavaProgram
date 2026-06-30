package Array;

import java.util.Scanner;
public class ArmStrongFreq
{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Size of array ");
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter a Element ");
			a[i]=sc.nextInt();
		}
		printFreq(a);
		sc.close();
	}
	public static void printFreq(int []a) {
		boolean [] visited=new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			if(visited[i]||!(isArmStrong(a[i]))) {
				continue;
			}
			int ct=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					ct++;
					visited[j]=true;
				}
			}
			System.out.println(a[i]+" --> "+ct);
		}
		
	}
	public static int rev(int n) {
		int rev=0;
		while(n!=0) {
			rev=rev*10+n%10;
			n/=10;
		}
		return rev;
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
