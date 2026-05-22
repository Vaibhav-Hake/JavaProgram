import java.util.Scanner;
class Q33{
   public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
	  int a=sc.nextInt();
	  double p1=sc.nextDouble();
	  int b=sc.nextInt();
	  double p2=sc.nextDouble();
	  double avg=(a*p1+b*p2)/(a+b);
	  System.out.println(avg);
	   
   }
}