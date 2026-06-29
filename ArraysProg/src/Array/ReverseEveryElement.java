package Array;

public class ReverseEveryElement {
	public static void main(String[]args) {
		int []a= {121,356,7876,5431};
		for(int i=0;i<a.length;i++) {
			a[i]=rev(a[i]);
			System.out.println(a[i]);
		}
		
	}
	public static int rev(int n) {
		int rev=0;
		while(n!=0) {
			rev=rev*10+n%10;
			n/=10;
		}
		return rev;
	}

}
