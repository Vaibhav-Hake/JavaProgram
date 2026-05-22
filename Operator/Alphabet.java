import java.util.Scanner;
class Alphabet{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character ");
		char ch=sc.next().charAt(0);
		boolean op=(ch>=65 && ch<=90 )|| (ch>=97 && ch<=122);
		System.out.println(op);
	}
}