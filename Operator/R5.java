import java.util.Scanner;
class R5{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Salary");
		float sal=sc.nextFloat();
		System.out.println("Enter a rent ");
		float rent =sc.nextFloat();
		System.out.println((sal-rent)>15000);
	}
}