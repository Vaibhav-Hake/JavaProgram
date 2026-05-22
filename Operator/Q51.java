import java.util.Scanner;
class Q51{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Length of box : ");
		byte len = sc.nextByte();
		
		System.out.print("Enter the width of box : ");
		byte width = sc.nextByte();
		
		System.out.print("Enter the height of box : ");
		byte height = sc.nextByte();
		
		int volume = len * width * height;
		
		System.out.print("Enter the amount for per Volume: ");
		int amount = sc.nextInt();
		
		long cost = volume * amount;
		System.out.println("Total cost : "+ cost);
		
	}
}