package Array;
import java.util.Arrays;
import java.util.Scanner;
public class SegrigationEvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Size of Array : ");
		int n=sc.nextInt();
		int [] a=new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter a Element : ");
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(seg(a)));
		
         sc.close();	
	}
	public static int[] seg(int[]a) {
		int []newArray=new int[a.length];
		int index=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
			newArray[index++]=a[i];	
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
			newArray[index++]=a[i];	
			}
		}
		return newArray;
	}

}
