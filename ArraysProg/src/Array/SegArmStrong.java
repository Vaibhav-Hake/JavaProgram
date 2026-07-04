package Array;
import java.util.Arrays;
import java.util.Scanner;
public class SegArmStrong {
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
			if(isArmStrong(a[i])) {
				newArray[index++]=a[i];
			}
			else {
				newArray[last--]=a[i];
			}
		}
		return newArray;
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
