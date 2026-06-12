import java.util.Scanner;
class Strong{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		if(isStrong(n)){
			System.out.println("it is Strong number ");
		}else{
			System.out.println("it is not Strong number  ");
		}
	}
	public static int sum(int n){
		int sum=0;
		while(n!=0){
			sum+=fact(n%10);
			n/=10;
		}
		return sum;
	}
	public static int fact(int n){
		int fact=1;
		while(n>0){
			fact*=n;
			n--;
		}
		return fact;
	}
	public static boolean isStrong(int n){
		return n==sum(n);
	}
}