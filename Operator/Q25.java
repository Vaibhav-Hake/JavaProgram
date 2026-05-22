import java.util.Scanner;
class Q25{
   public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
	   double price=sc.nextDouble();
	   price=price+((price*10)/100);
	   price=price+((price*20)/100);
	   
	 
	   System.out.println(price);
	   
   }
}