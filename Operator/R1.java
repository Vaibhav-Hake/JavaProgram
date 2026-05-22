import java.util.Scanner;
class R1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Amount");
		double p=sc.nextDouble();
		double d=sc.nextDouble();
		System.out.println((p-d)>=400);
	}
}