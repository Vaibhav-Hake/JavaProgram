import java.util.Scanner;
class Q9{
   public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
	   int choclate=sc.nextInt();
	   int friend=sc.nextInt();
	   int share=choclate/friend;
	   int rem=choclate%friend;
	   System.out.println(share);
	   System.out.println(rem);
   }
}