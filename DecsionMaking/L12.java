import java.util.Scanner;
class L12{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a trend ");
		String trend=sc.next();
		System.out.println("Enter a risk ");
		String risk=sc.next();
		System.out.println("Enter a profit ");
		int profit=sc.nextInt();
		if(trend.equalsIgnoreCase("Bull")&&risk.equalsIgnoreCase("High")&&profit<10){
			System.out.println("BUY");
		}else if(trend.equalsIgnoreCase("Bear")&&profit<-5){
			System.out.println("SELL");
		}else if(profit>=20){
			System.out.println("SELL(Book Profit)");
			
		}else if(trend.equalsIgnoreCase("Stable")){
				System.out.println("Hold");
		}else{
			System.out.println("WAIT");
		}
	}
}