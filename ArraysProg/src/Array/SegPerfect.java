package Array;
import java.util.Arrays;
import java.util.Scanner;
public class SegPerfect{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Size of Array : ");
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter a Element : ");
			a[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(seg(a)));
		sc.close();
	}
	public static int[]seg(int[]a){
		int newArray []=new int[a.length];
		int index=0;
		int last=a.length-1;
		for(int i=0;i<a.length;i++) {
			if(isPerfect(a[i])) {
				newArray[index++]=a[i];
			}
			else {
				newArray[last--]=a[i];
			}
		}
		return newArray;
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
