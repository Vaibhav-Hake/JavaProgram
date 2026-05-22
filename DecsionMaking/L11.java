import java.util.Scanner;
class L11{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a income");
		int income=sc.nextInt();
		System.out.println("Enter a age");
		int age=sc.nextInt();
		System.out.println("Enter a invest");
		int invest=sc.nextInt();
		System.out.println("Late or not : ");
		boolean late=sc.nextBoolean();
		
		int deduction=Math.min(invest,150000);
		
		if(age>60){
			deduction+=50000;
		}
		int taxable=income-deduction;
		double tax;
		if(taxable<=250000){
			tax=0;
		}else if(taxable<=500000){
			tax=taxable*0.05;
		}else if(taxable<=1000000){
			tax=taxable*0.20;
		}
		else{
			tax=taxable*0.30;
		}
		
		if(late){
			tax+=tax*0.10;
		}
		System.out.println("Tax : "+(int)tax);
		
	}
}