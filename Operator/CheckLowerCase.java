import java.util.Scanner;
class CheckLowerCase{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Charactor ");
		char ch=sc.next().charAt(0);
		String op=(ch>=97 && ch<=122)?ch+" is LoweCase":ch+" is not LoweCase";
		System.out.println(op);
	}
}