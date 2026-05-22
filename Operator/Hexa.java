import java.util.Scanner;
class Hexa{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side : ");
		float side=sc.nextFloat();
		double area=(3*Math.sqrt(3)/2)*(side*side);
		System.out.println(area);
	}
}