package Array;

import java.util.Arrays;

public class TrailingZero {
	public static void main(String[] args) {
		int []a= {0,1,0,1,0,1,0,1,0};
		System.out.println(Arrays.toString(tralingZero(a)));
	}
	public static int[] tralingZero(int []a) {
		int i=0;
		int j=0;
		while(i<a.length) {
			if(a[i]==0) {
				j++;
				a[i]=1;
			}
			i++;
		}
		j=a.length-j;
		while(j<a.length) {
			a[j++]=0;
		}
		return a;
	}

}
