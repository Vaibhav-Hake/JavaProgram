package Array;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[]a= {5,6,8,1,2,56};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int[]a) {
		for(int i=1;i<a.length;i++) {
			int j=i-1;
			int temp=a[i];
			while(j>=0&&a[j]>temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
	}

}
