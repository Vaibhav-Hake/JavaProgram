import java.util.Scanner;
class Shop{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a product price ");
		double price=sc.nextDouble();
		System.out.println("Enter Quantity ");
		int quantity=sc.nextInt();
        System.out.println("Enter a userType (regular/Primium)");
		String userType=sc.nextLine();
		
		
		System.out.print("Is Prime member? (true/false): ");
	boolean isPrime = sc.nextBoolean();
 double total = price * quantity;

  double discount = (userType.equalsIgnoreCase("premium")) ? (0.20 * total) :(total > 1000) ? (0.10 * total) : 0;

 double shipping = isPrime ? 0 :(total > 500) ? 50 : 100;

double  finalPrice = total - discount + shipping;

 String message = (total <= 0)
 ? "Invalid order!"
 : "Order placed successfully!";
 System.out.println("\n----- QuickShop Order Summary -----");
 System.out.println("Total Amount: " + total);
 System.out.println("Discount: " + discount);
 System.out.println("Shipping Charges: " + shipping);
 System.out.println("Final Payable: " + finalPrice);
 System.out.println(message);
 }
}