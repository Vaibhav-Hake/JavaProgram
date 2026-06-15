import java.util.Scanner;
class RevNum{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num : ");
		int n=sc.nextInt();
		System.out.println(rev(n,0));
	}
	public static int rev(int n,int rev){
		return n==0?rev:rev(n/10,rev*10+n%10);
	}
}