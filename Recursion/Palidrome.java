import java.util.Scanner;
class Palidrome{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num : ");
		int n=sc.nextInt();
		if(rev(n,0)==n){
			System.out.println("Palidrome no  : "+n);
		}else{
				System.out.println(" Not Palidrome no  : "+n);
		}
	}
	public static int rev(int n,int rev){
		return n==0?rev:rev(n/10,rev*10+n%10);
	}
}