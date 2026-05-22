import java.util.Scanner;
class Q36{
   public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
	  double c=sc.nextDouble();
	  double per=sc.nextDouble();
	  double f=((9.0/5)*c)+32;
	  f=f+((f*per)/100);

	 
	  System.out.println(f);
   }
}