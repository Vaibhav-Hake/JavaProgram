package Array;
import java.util.Arrays;
import java.util.Scanner;
public class SegTech{
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
			if(isTech(a[i])) {
				newArray[index++]=a[i];
			}
			else {
				newArray[last--]=a[i];
			}
		}
		return newArray;
	}
	public static int den(int n) {
		int d=1;
		int ct=ct(n);
		for(int i=0;i<ct/2;i++) {
			d*=10;
		}
		return d;
	}
	public static int ct(int n) {
		int c=0;
		for(int i=n;i!=0;i/=10) {
			c++;
		}
		return c;
	}
	public static boolean isTech(int n) {
		if(ct(n)%2==0) {
			int last= n%den(n);
			int first= n/den(n);
			int sum=first+last;
			sum=sum*sum;
			return sum==n;
		}
		return false;
	}
}
