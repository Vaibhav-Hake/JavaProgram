import java.util.Scanner;
class SpecialChar{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character ");
		char ch=sc.next().charAt(0);
		boolean op=!((ch>=48&&ch<=57)||(ch>=65&&ch<=90)||(ch>=97&&ch<=122));
		System.out.println(op);
		boolean op2=(ch>=0&&ch<=47)||(ch>=58&&ch<=64)||(ch>=91&&ch<=96)||(ch>=123&&ch<=127);
		System.out.println(op2);
		
	}
}