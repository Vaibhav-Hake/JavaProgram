import java.util.Scanner;

class Q59{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter height of a triangle : ");
		byte height = sc.nextByte();
		
		System.out.print("Enter the bade of a triangle : ");
		byte base = sc.nextByte();
		
		float area = (height * base)/2;
		System.out.print("Area of a triangle is : "+area);
	}
}