import java.util.Scanner;
class R27{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a : ");
		int a=sc.nextInt();
		System.out.println("Enter b : ");
		int b=sc.nextInt();
		System.out.println("Enter c : ");
		int c=sc.nextInt();
		System.out.println(a+b*c>100&&b/c=4&&a%c==0);
	}
}