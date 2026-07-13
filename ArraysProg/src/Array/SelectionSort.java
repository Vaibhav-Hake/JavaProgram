package Array;

import java.util.Arrays;

public class SelectionSort {
public static void main(String[] args) {
	int[]a= {1,2,6,7,99,2,4};
	System.out.println(Arrays.toString(a));
	sort(a);
	System.out.println(Arrays.toString(a));
}
public static void sort(int []a) {
	for(int i=0;i<a.length;i++) {
		int min=i;
		for(int j=i+1;j<a.length;j++) {
			if(a[j]<a[min]) {
				min =j;
			}
		}
		int temp=a[min];
		a[min]=a[i];
		a[i]=temp;
	}
}
}
