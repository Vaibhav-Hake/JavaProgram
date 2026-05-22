import java.util.Scanner;
class ATM{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a current Bal : ");
		double bal=sc.nextDouble();
		System.out.println("Are you sal");
		boolean sal=sc.nextBoolean();
		
		System.out.println("\n 1.Deposite");
		System.out.println("2.Withdraw");
		System.out.println("3.Check Loan Eligiblity ");
		System.out.println("Enter your choice ");
		int choice=sc.nextInt();
		
		
		double amt=(choice==1||choice==2)?sc.nextDouble():0;
		double newBal=(choice==1)?(bal+amt):(choice==2)?(amt<=bal)?(bal-amt):bal:bal;
		String loanStatus=(bal>50000&&sal)?"Eligible ": (bal>20000)?"Eligible for small loan ":"Not Eligible for loan ";
		String msg=(choice==1)?"Deposite Succesfill ":
		           (choice==2)?(amt<=bal)?"Withdraw Amount Succeful ":"Insufficient Amount ":
				   (choice==3)?loanStatus:"Invalid Choice ";
				   System.out.println("\n-----Banking Summary-----");
				   System.out.println("Updated bal : "+newBal);
				   System.out.println(msg);
	}
}