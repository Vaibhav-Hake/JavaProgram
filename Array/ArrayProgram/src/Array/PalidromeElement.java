package Array;

public class PalidromeElement {
	public static void main(String[]args) {
		int []a= {121,356,7876,5431};
		for(int i=0;i<a.length;i++) {
			if(isPalidrome(a[i])) {
				System.out.println(a[i]);
			}
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
	public static boolean isPalidrome(int n) {
		return n==rev(n);
	}

}
