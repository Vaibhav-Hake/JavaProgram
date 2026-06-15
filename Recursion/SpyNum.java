import java.util.Scanner;
class SpyNum{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num : ");
		int n=sc.nextInt();
		if(sum(n)==pro(n)){
			System.out.println("Yes Spy ");
		}else{
			System.out.println("No Spy ");
		}
	}
	public static int pro(int n){
		return n==0?1:n%10*pro(n/10);
	}
	public static int sum(int n){
		return n==0?0:n%10+sum(n/10);
	}
	
}
