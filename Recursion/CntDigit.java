import java.util.Scanner;
class CntDigit{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=sc.nextInt();
		System.out.println(cnt(num));
	}
	public static int cnt(int n){
		return n==0?0:1+cnt(n/10);
	}
}