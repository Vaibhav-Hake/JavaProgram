import java.util.Scanner;
class Peri{
	public static void main(String[] args{
		Scanner sc = new Scanner(System.in);
		System.out.println(Enter value of Radius: ");
		float r = sc.nextFloat();
		float pi = 3.14;
		
		float perimeter = 2*pi*r;
		System.out.println("Perimeter of circle: "+perimeter);
		
		float area = pi*r*r;
		System.out.println("Area of circle: "+area);
	}
}