package Array;
import java.util.Scanner;
public class HappyNum{
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
			if(isHappy(a[i])) {
				System.out.println(a[i]);
			}
			}
		sc.close();
		}
		public static boolean isHappy(int n) {
			int sum=sqSum(n);
			while(sum!=1&&sum!=4) {
				sum=sqSum(sum);
			}
			return sum==1;
		}
		public static int sqSum(int n) {
			int sum=0;
			while(n!=0) {
				sum+=(n%10*n%10);
				n/=10;
			}
			return sum;
		}
	
		
	}

	


