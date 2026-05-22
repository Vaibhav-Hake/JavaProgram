import java.util.Scanner;
class CheckUpperCase{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Charactor ");
		char ch=sc.next().charAt(0);
		String op=(ch>=65 && ch<=90 )?ch+" is Upper Case":ch+" is not UpperCase";
		System.out.println(op);
	}
}