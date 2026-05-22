import java.util.Scanner;
class CheckAlphabet{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Charactor ");
		char ch=sc.next().charAt(0);
		String op=(ch>=65 && ch<=90 || ch>=97 && ch<=122)?ch+" is Alphabet":ch+" is not Alphabet";
		System.out.println(op);
	}
}