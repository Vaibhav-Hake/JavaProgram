import java.util.Scanner;
class Q1{
   public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
	   double bal=sc.nextDouble();
	   double dep=sc.nextDouble();
	   bal=bal+dep;
	   double wit=sc.nextDouble();
	   bal-=wit;
	   System.out.println(bal);
   }
}