import java.util.Scanner;
class R23{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Salary ");
		float sal=sc.nextFloat();
		System.out.println("Enter a rent ");
		float r=sc.nextFloat();
		System.out.println("Enter a extra ");
		float f=sc.nextFloat();
		System.out.println((sal-(r+f))>=30000);
	}
}