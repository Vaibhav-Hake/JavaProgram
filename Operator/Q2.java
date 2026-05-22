import java.util.Scanner;
class Q2{
   public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
	   double price=sc.nextDouble();
	   double dis=sc.nextDouble();
	   price=price-(price*10/100);
	   System.out.println(price);
   }
}