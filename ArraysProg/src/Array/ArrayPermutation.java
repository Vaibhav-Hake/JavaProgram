package Array;

import java.util.Arrays;

public class ArrayPermutation {
 public static void main(String[]args) {
	 int[]a= {1,2,3};
	 perm(a,0);
 }
 public static void perm(int []a,int index) {
	 if(index==a.length) {
		 System.out.println(Arrays.toString(a));
		 return;
	 }
	 for(int i=index;i<a.length;i++) {
		 swap(a,index,i);
		 perm(a,index+1);
		 swap(a,index,i);
	 }
 }
 public static void swap(int[]a,int i,int j) {
	 int temp=a[i];
	 a[i]=a[j];
	 a[j]=temp;
 }
}
