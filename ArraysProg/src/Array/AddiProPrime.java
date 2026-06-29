package Array;
import java.util.Scanner;
public class AddiProPrime{
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
			if(isPrime(a[i])) {
				sum+=a[i];
				pro*=a[i];
			}
			}
		System.out.println("Addition : "+sum);
		System.out.println("Multiplication : "+pro);
		sc.close();
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

	


