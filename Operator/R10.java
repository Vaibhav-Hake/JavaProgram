import java.util.Scanner;
class R10{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1 ");
		int n1=sc.nextInt();
		System.out.println("Enter num 2");
		int n2=sc.nextInt();
		System.out.println(n1>n2 && n1%n2==0);
	}
}