package Array;
import java.util.Scanner;
public class AddiProPerfectSq {
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
			if(isPerfectSq(a[i])) {
				sum+=a[i];
				pro*=a[i];
			}
		}
		System.out.println("Addition : "+sum);
		System.out.println("Multiplication : "+pro);
		sc.close();
		
	}
	public static boolean isPerfectSq(int n) {
		for(int i=1;i*i<=n;i++) {
			if(i*i==n) {
				return true;
			}
		}
		return false;
	}

	
	

}
