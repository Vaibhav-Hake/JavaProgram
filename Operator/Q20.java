import java.util.Scanner;
class Q20{
   public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
	   double distance=sc.nextDouble();
	   double mil=sc.nextDouble();
	   double extra =sc.nextDouble();
	   double fuel=distance/mil;
	   fuel+=extra;
	 
	   System.out.println(fuel);
	   
   }
}