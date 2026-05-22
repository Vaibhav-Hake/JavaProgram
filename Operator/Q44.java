import java.util.Scanner;

class Q44{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		
		
		double amt = sc.nextDouble();
		
		
		float tax = sc.nextFloat();
		
		double originalAmt = amt / (1+tax/100);
		
		System.out.println(originalAmt);
		
	}
}