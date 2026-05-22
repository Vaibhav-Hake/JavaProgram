import java.util.Scanner;

class Q57{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the amount invested : ");
		double amount = sc.nextDouble();
		
		System.out.print("Enter first interest rate: ");
		byte interest1 = sc.nextByte();
		
		System.out.print("Enter second interest rate : ");
		byte interest2 = sc.nextByte();
		
		double interstAmount1 = amount * interest1 /100;
		double interestAmount2 = amount * interest2/100;

		double diffInInterest = interstAmount1 - interestAmount2;
		System.out.println("Difference in interest : "+diffInInterest);
		
	}
}