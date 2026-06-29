package Array;
import java.util.Scanner;
public class SunnyCount {
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
			if(isSunny(a[i]+1)) {
				ct++;
			}
		}
		System.out.println("Count of Sunny num from array "+ct);
		sc.close();
		
	}
	public static boolean isSunny(int n) {
		for(int i=1;i*i<=n;i++) {
			if(i*i==n) {
				return true;
			}
		}
		return false;
	}

	
	

}
