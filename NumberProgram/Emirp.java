import java.util.Scanner;
class Emirp{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(isPrime(num)&&isPrime(rev(num))){
			System.out.println("it is s Emirp number  ");
		}else{
			System.out.println("it is not Emirp number ");
		}
	}
	public static boolean isPrime(int n){
		if(n==2) return true;
		else if(n<=1||n%2==0){
			return false;
		}
		else{
			for(int i=3;i*i<=n;i+=2){
				if(n%i==0){
					return false;
				}
			}
			return true;
		}
	}
	public static int rev(int n){
		int rev=0;
		while(n!=0){
			rev=rev*10+n%10;
			n/=10;
		}
		return rev;
	}
}