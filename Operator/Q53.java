import java.util.Scanner;

class Q53{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter wall area : ");
		short wall = sc.nextByte();
		
		System.out.print("Enter the cover area with 1 brick : ");
		byte coveredArea = sc.nextByte();
		
		
		int requiredBricks = wall * coveredArea;
		
		System.out.println("Total required bricks : "+ requiredBricks);		
	}
}