import java.util.Scanner;
class Even{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		String op1=num%2==0 ? num+"it is Even":num+"it is odd";
		System.out.println(op1);
		String op2=(num/2)*2==num ? num+"it is Even":num+"it is odd";
		System.out.println(op2);
		String op3=num/2==num/2.0 ? num+"it is Even":num+"it is odd";
		System.out.println(op3);
	}
}