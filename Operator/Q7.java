import java.util.Scanner;
class Q7{
   public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
	   double price =sc.nextDouble();
	   double gst=sc.nextDouble();
	   price=price+((price*gst)/100);
	   System.out.println(price);
   }
}