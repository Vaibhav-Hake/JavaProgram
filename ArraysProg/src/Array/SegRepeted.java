package Array;
import java.util.Arrays;
import java.util.Scanner;
public class SegRepeted {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Size of array : ");
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter a Element ");
			a[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(seg(a)));
		sc.close();
	}
	public static int[] seg(int []a) {
		int []b=new int[a.length];
		int index=0;
		int last=a.length-1;
		for(int i=0;i<a.length;i++) {
			if(isRep(a,a[i])) {
				b[index++]=a[i];
			}else {
				b[last--]=a[i];
			}
		}
		return b;
	} 
	public static boolean isRep(int []a,int ele) {
		int ct=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				ct++;
			}
		}
		if(ct>1) {
			return true;
		}
		return false;
	}

}
