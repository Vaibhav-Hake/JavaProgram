package Array;

import java.util.Scanner;
public class CountDistinct {
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
		int ct=0;
		boolean [] visited=new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			if(visited[i]) {
				continue;
			}
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
	
					visited[j]=true;
				}
			}
			ct++;
		}
		System.out.println(ct);
		
	}
	
	

}
