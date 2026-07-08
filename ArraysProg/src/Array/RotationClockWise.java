package Array;

import java.util.Arrays;

public class RotationClockWise {
	public static void main(String[] args) {
		int[]a= {10,20,30,40,50};
		System.out.println(Arrays.toString(a));
		shift(a,2);
	
	}
	public static void shift(int[]a,int k) {
		int []temp=new int[a.length];
		for(int i=0;i<a.length;i++) {
			temp[(i+k)%a.length]=a[i];
		}
		System.out.println(Arrays.toString(temp));
	}

}
