package Array;
import java.util.Scanner;
public class AddiSubArray{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int [] a=new int[n];
		int sum=0;
		int sub=0;
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter : ");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			
				sum+=a[i];
				sub-=a[i];
			
		}
		System.out.println("Addition : "+sum);
		System.out.println("Sub : "+sub);
		sc.close();
		
	}
	

}
