import java.util.Scanner;
class Q11{
   public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
	  double sal=sc.nextDouble();
	  double bon=sc.nextDouble();
       sal+=bon;
	   double tax=sc.nextDouble();
	   sal=sal-((sal*tax)/100);
	   System.out.println(sal);
   }
}