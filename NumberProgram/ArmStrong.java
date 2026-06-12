import java.util.Scanner;
class ArmStrong{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		if(isArmStrong(n)){
			System.out.println("it is  ArmStrong ");
		}else{
			System.out.println("it is not ArmStrong ");
		}
	}
	public static int count(int n){
		int ct=0;
		while(n!=0){
			ct ++;
			n/=10;
		}
		return ct;
	}
	
	public static int power(int n,int r){
		int p=1;
		for(int i=1;i<=r;i++){
			p*=n;
		}
		return p;
	}
	public static int sum(int n){
		int sum=0;
		int c=count(n);
		while(n!=0){
			sum+=power(n%10,c);
			n/=10;
		}
		return sum;
	}
	public static boolean isArmStrong(int n){
		return n==sum(n);
	}
}