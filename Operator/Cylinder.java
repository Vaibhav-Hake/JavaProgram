import java.util.Scanner;
class Cylinder{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Radius and Height of a cylinder: ");
		float radius = sc.nextFloat();
		float height = sc.nextFloat();
		final float pi = 3.14f;
		
		double area = pi * radius * radius;
		double volume = area * height;
		
		System.out.println("The area is : "+area);
		System.out.println("The volume is : "+volume);
	}
}