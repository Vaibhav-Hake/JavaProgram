import java.util.Scanner;
class Q13{
   public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
	   double dis =sc.nextDouble();
	   double mil=sc.nextDouble();
	    double pp =sc.nextDouble();
	   double tollPrice=sc.nextDouble();
	   double fuel=double/mil;
	   double fPrice=fuel*pp;
	   fPrice+=tollPrice;
	   System.out.println(fPrice);
   }
}