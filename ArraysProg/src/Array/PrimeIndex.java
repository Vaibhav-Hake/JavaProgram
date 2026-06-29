package Array;
import java.util.Scanner;
public class PrimeIndex{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int [] a=new int[n];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter : ");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			if(isPrime(i)) {
				System.out.println(a[i]);
			}
			}
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

	


