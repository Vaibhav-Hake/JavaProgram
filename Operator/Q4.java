import java.util.Scanner;
class Q4{
   public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
	   int pizza=sc.nextInt();
	   int friend=sc.nextInt();
	   int get=pizza/friend;
	   int rem=pizza%friend;
	   System.out.println(get);
	   System.out.println(rem);
   }
}