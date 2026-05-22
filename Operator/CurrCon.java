import java.util.Scanner;
class CurrCon{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter Amount in (INR) :  ");
		double amt=sc.nextDouble();
		System.out.println("\n LIst of Curr ");
		System.out.println("1.USD \n 2.Eur \n 3.GBP \n 4.JPY \n 5.AFN");
		System.out.print("\n Enter Currency : ");
        String curr=sc.next().toUpperCase();
		
		double con=(curr.equals("USD")?amt*0.01043768:
		            curr.equals("EUR")?amt*0.00891598:
					curr.equals("GBP")?amt*0.00773:
					curr.equals("JPY")?amt*1.64904:
					curr.equals("AFN")?amt*0.64005:
					Double.MAX_VALUE);
		
		String op=amt+" INR = "+String.format("%.2f",con)+" "+curr;
		System.out.println();
		System.out.println(con==Double.MAX_VALUE?"Invalid Currency ":op);
		
	}
}