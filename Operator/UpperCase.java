import java.util.Scanner;
class UpperCase{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character :");
		char ch=sc.next().charAt(0);
		boolean op=ch>='A' && ch<='Z' ;
		System.out.println(op);
	}
}