package Array;

import java.util.Arrays;

public class SelectionSortDesc {
public static void main(String[] args) {
	int[]a= {1,2,6,7,99,2,4};
	System.out.println(Arrays.toString(a));
	sort(a);
	System.out.println(Arrays.toString(a));
}
public static void sort(int []a) {
	for(int i=0;i<a.length;i++) {
		int max=i;
		for(int j=i+1;j<a.length;j++) {
			if(a[j]>a[max]) {
				max=j;
			}
		}
		int temp=a[i];
		a[i]=a[max];
		a[max]=temp;
	}
}
}
