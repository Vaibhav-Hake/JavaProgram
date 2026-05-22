import java.util.Scanner;
class Q5{
   public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
	   double dis=sc.nextDouble();
	   double milage=sc.nextDouble();
	   double price=sc.nextDouble();
	   double fuel=dis/milage;
	   double cost =fuel*price;
	   System.out.println(cost);
   }
}