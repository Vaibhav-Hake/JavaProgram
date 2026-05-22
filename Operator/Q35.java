import java.util.Scanner;
class Q35{
   public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
	  double usd=sc.nextDouble();
	  double in=sc.nextDouble();
	  double r=sc.nextDouble();
	  double rs=usd*in;
	  rs=rs+(rs*r/100);
	  System.out.println(rs);
   }
}