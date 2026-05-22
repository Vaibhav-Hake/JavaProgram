import java.util.Scanner;
class Q37{
   public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
	  double sal=sc.nextDouble();
	  double r1=sc.nextInt();
	  double r2=sc.nextInt();
	  double r3=sc.nextInt();
    double t=r1+r2+r3;
	double third=(r3/t)*sal;
	 
	  System.out.println(third);
   }
}