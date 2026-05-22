import java.util.Scanner;
class R14{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number ");
		int num=sc.nextInt();
		System.out.println(num%2==0&&num%5==0);
	}
}