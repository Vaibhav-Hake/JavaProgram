import java.util.Scanner;
class Q17{
   public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
	   double base=sc.nextDouble();
	   double perKm=sc.nextDouble();
	   double distance=sc.nextDouble();
	   double kmCharge=perKm*distance;
	   double totalCharge=kmCharge+base;
	   System.out.println(totalCharge);
	   
   }
}