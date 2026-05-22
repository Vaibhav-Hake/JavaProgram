import java.util.Scanner;

class Q52{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of units : ");
		long units = sc.nextLong();
		
		System.out.print("Enter price for per unit : ");
		float amount = sc.nextFloat();
		
		double totalCost = units * amount;
		System.out.println("Total cost : "+ totalCost);
		
	}
}