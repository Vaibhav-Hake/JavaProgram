import java.util.Scanner;
class CheckDigit{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Charactor ");
		char ch=sc.next().charAt(0);
		String op=(ch>=47 && ch<=57)?ch+" it is Digit  ":ch+" is not Digit ";
		System.out.println(op);
	}
}