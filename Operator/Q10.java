import java.util.Scanner;
class Q10{
   public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
	  double costPrice=sc.nextDouble();
	  double sellingPrice=sc.nextDouble();
	  double profitPrice=sellingPrice-costPrice;
	  double profitPer=(profitPrice*100)/costPrice;
	  System.out.println(profitPer);
   }
}