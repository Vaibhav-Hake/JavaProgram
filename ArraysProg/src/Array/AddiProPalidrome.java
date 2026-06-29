package Array;

public class AddiProPalidrome {
	public static void main(String[]args) {
		int []a= {121,356,7876,5431};
		int sum=0;
		int pro=1;
		for(int i=0;i<a.length;i++) {
			if(isPalidrome(a[i])) {
				sum+=a[i];
				pro*=a[i];
			}
		}
		System.out.println("Addition : "+sum);
		System.out.println("Multiplication : "+pro);
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
