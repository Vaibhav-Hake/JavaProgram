import java.util.Scanner;

class Q54{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the side of square : ");
		byte side = sc.nextByte();
		
		int area = side * side;
		
		System.out.print("Enter the cost for per unit area : ");
		byte amount = sc.nextByte();
		
		long cost = area * amount;
		System.out.println("Total cost : "+ cost);
		
	}
}