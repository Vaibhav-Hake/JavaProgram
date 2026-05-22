import java.util.Scanner;
class R21{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Price ");
		float p=sc.nextFloat();
		System.out.println("Enter a Dis ");
		float dis=sc.nextFloat();
		System.out.println("Enter a tax ");
		float tax=sc.nextFloat();
		System.out.println((p-dis+tax)>1000);
	}
}