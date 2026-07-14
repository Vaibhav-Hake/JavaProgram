package Array;

import java.util.Arrays;

public class MergeDesc {
  public static void main(String[] args) {
	  int[]a= {1,2,6,7,99,2,4};
		System.out.println(Arrays.toString(a));
		devide(a);
		System.out.println(Arrays.toString(a));
}
  public static void devide(int []a) {
	  if(a.length==1) {
		  return;
	  }
	  int []left=new int[a.length/2];
	  int []right=new int[a.length-left.length];
	  for(int i=0;i<left.length;i++) {
		  left[i]=a[i];
	  }
	  for(int i=0;i<right.length;i++) {
		  right[i]=a[i+left.length];
	  }
	  devide(left);
	  devide(right);
	  merge(a, left,right);
  }
  public static void merge(int []a,int[]left,int[]right) {
	  int i=0,j=0,k=0;
	  while(i<left.length&&j<right.length) {
		  if(left[i]>right[j]) {
			  a[k++]=left[i++];
		  }else {
			  a[k++]=right[j++];
		  }
	  }
	  while(i<left.length) {
		  a[k++]=left[i++];
	  }
	  while(j<right.length) {
		  a[k++]=right[j++];
	  }
  }
}
