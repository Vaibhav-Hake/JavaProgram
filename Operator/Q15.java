import java.util.Scanner;
class Q15{
   public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
	   double price=sc.nextDouble();
	   double charge=sc.nextDouble();
	   int friend=sc.nextInt();
	   double extra=price+(price*charge/100);
	   double split=extra/friend;
	   System.out.println(split);
   }
}