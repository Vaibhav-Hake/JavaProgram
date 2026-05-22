import java.util.Scanner;
class CheckSpecial{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Charactor ");
		char ch=sc.next().charAt(0);
		String op=!(ch>=65 && ch<=90 || ch>=97 && ch<=122 || ch>=47 && ch<=57)?ch+" Special Character ":ch+" is not Special Charactor";
		System.out.println(op);
	}
}