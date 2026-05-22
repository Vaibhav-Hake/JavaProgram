import java.util.Scanner;
class Acceleration{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Starting Velocity :");
		float v0=sc.nextFloat();
		System.out.println("Enter a Ending Velocity :");
		float v1=sc.nextFloat();
		System.out.println("Enter a time :");
		float t=sc.nextFloat();
		
		float a=(v1-v0)/t;
		System.out.println(a);
		
	}
}