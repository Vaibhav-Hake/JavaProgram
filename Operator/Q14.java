import java.util.Scanner;
class Q14{
   public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
	   double amt=sc.nextDouble();
	   double intrest=sc.nextDouble();
	   amt=amt+((amt*intrest)/100);
	   amt=amt+((amt*intrest)/100);
	   System.out.println(amt);
   }
}