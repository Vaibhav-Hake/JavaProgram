import java.util.Scanner;
class Q26{
   public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
	   double sellingPrice=sc.nextDouble();
	   double profit=sc.nextDouble();
	  double costPrice=sellingPrice*100/(100+profit);
	 
	   System.out.println(costPrice);
	   
   }
}