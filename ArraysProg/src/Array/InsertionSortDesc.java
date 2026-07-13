package Array;

import java.util.Arrays;

public class InsertionSortDesc {
	public static void main(String[] args) {
		int[]a= {1,2,6,7,99,2,4};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int[]a) {
		for(int i=0;i<a.length;i++) {
			  int j=i-1;
			  int temp=a[i];
			  while(j>=0&&a[j]<temp) {
				  a[j+1]=a[j];
				  j--;
			  }
			  a[j+1]=temp;
		}
	}

}
