import java.util.Scanner;
class CelciousCon{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter value in (C)");
		float c=sc.nextFloat();
		
		System.out.println("\n List of Con");
		System.out.println("1.F \n 2.K \n 3.R");
		System.out.println("Enter ");
		String m=sc.next().toUpperCase();
		
		double op=m.equals("F")?c*(9/5)+32 :
		          m.equals("K")?c+273.15:
				  m.equals("R")?c*(9/5)+491.67:
				  Double.MAX_VALUE;
				  
	   String op=c+" c ="+op+" "+m;
	   System.out.println();
	   System.out.println(op==Double.MAX_VALUE? "Invalid ":op);
	   
	}
}