import java.util.Scanner;
class Q29{
   public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
	  double p=sc.nextDouble();
	  double r=sc.nextDouble();
	  for(int i=0;i<3;i++){
		  p=p+(p*10/100);
	  }
	   
	 
	   System.out.println(p);
	   
   }
}