import java.util.Scanner;
class SumDigit{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num : ");
		int num=sc.nextInt();
		System.out.println(sum(num));
	}
	public static int sum(int n){
		return n==0?0:n%10+sum(n/10);
	}
}