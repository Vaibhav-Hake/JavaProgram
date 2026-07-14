package Array;

public class MissingElement {
public static void main(String[] args) {
	int []a= {1,6,7,9,10,15};
    kthMissing(a,3);
}
public static void kthMissing(int[]a,int k) {
	int min=min(a);
	int max=max(a);
	
	boolean []v=new boolean[max+1];
	
	for(int i=0;i<a.length;i++) {
		v[a[i]]=true;
	}
	int ct=0;
	for(int i=min;i<=max;i++) {
		if(!v[i]) {
			ct++;
		}
		if(ct==k) {
			System.out.println(i);
			return;
		}
	}
}
public static int  min(int []a) {
	int min=Integer.MAX_VALUE;
	for(int i=0;i<a.length;i++) {
		if(a[i]<min) {
			min=a[i];
		}
	}
	return min;
}
public static int  max(int []a) {
	int max=Integer.MIN_VALUE;
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
	return max;
}

}
