import java.util.Scanner;
class ProDigit{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num : ");
		int num=sc.nextInt();
		System.out.println(pro(num));
	}
	public static int pro(int n){
		return n==0?1:n%10*pro(n/10);
	}
}