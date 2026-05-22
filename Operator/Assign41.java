import java.util.Scanner;

class Assign41{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter the paid amount: ");
		double amt = sc.nextDouble();
		
		System.out.print("Enter the tax percentage: ");
		float tax = sc.nextFloat();
		
		double originalAmt = amt / (1+tax/100);
		
		System.out.println("Original price of product: "+originalAmt);
		
	}
}