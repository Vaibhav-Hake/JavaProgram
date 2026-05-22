import java.util.Scanner;
class CompoundValue{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the monthly saving amount: ");
		int amt = sc.nextInt();
		
		byte annualInterest = 5;
		amt = amt + (1 + (annualInterest/100)/12); //first month
		amt = amt + (1 + (annualInterest/100)/12);
		amt = amt + (1 + (annualInterest/100)/12); 
		amt = amt + (1 + (annualInterest/100)/12);
		amt = amt + (1 + (annualInterest/100)/12);
		amt = amt + (1 + (annualInterest/100)/12); //sixth month
		
		System.out.println("After the sixth month, the account value is Rs : "+amt);
	}
}