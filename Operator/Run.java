import java.util.Scanner;
class Run{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter speed and Accelaration");
		double v=sc.nextDouble();
		double a=sc.nextDouble();
		double length=(v*v)/(2*a);
		System.out.println(length);
	}
}