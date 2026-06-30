package Array;

import java.util.Scanner;
public class PrimeFreq {
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
			if(visited[i]||!(isPrime(a[i]))) {
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
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		int den=2;
		while(den<=num/2) {
			if(num%den==0) {
				return false;
			}
			den++;
		}
		return true;
	}
	
	

}
