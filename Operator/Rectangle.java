import java.util.Scanner;
class Rectangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Height: ");
		float height = sc.nextFloat();
		System.out.println("width");
		float width = sc.nextFloat();
		
		float area = height*width;
		System.out.println("Area of Rectangle: "+area);
		
		float perimeter = 2*(height+width);
		System.out.println("Perimeter of Rectangle: "+perimeter);
		
		
	}
}