import java.util.Scanner;
class LoanCal{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Loan Amount : ");
		double amt=sc.nextDouble();
		System.out.println("Enter ann interest ");
		double i=sc.nextDouble();
		System.out.println("Enter a Loan Tensure ");
		int ten=sc.nextInt();
		System.out.println("Are you salaried ");
		boolean sal=sc.nextBoolean();
		double monIn=i/12;
		double emi= monIn==0?amt/ten:(amt*monIn*Math.pow(1+monIn,ten))/(Math.pow(1+monIn,ten-1));
		
		double totalp=emi*ten;
		double totalI=totalp-amt;
		
		String eligibity=(amt<=50000&&sal)?" Easily Eligible ":(amt<=1000000)?"Eligiblity with Condtion ":"Highly Risk/Not Easily Eligible ";
		String emiStatus=(emi<5000)?"Low Emi ":(emi<20000)?"Modret Emi":"High Emi ";
		String msg=(amt<=0||ten<=0)?"Invalid loan Details ":"Loan Calculated Succesfully ";
		
		System.out.println("\n-----FinTrust Bank Loan Summery -----");
		System.out.println("EMI per month "+emi);
		System.out.println("Total Payment "+totalp);
		System.out.println("Total Interest "+totalI);
		System.out.println("Eligiblity "+eligibity);
		System.out.println("emi Status"+emiStatus);
		System.out.println("Message "+msg);
	}
}